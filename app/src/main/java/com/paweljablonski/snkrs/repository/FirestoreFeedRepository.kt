package com.paweljablonski.snkrs.repository

import com.google.firebase.firestore.CollectionReference
import com.paweljablonski.snkrs.model.Feed
import com.paweljablonski.snkrs.network.Response

import kotlinx.coroutines.tasks.await

import javax.inject.Inject

class FirestoreFeedRepository @Inject constructor(
    private val sneakersRef: CollectionReference
) {

    suspend fun getAllFeedsFromDatabase(): Response {
        val response = Response()
        try {
            response.feeds = sneakersRef.get().await().documents.mapNotNull { snapShot ->
                snapShot.toObject(Feed::class.java)
            }
        } catch (exception: Exception) {
            response.exception = exception
        }
        return response
    }

}
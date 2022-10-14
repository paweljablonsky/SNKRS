package com.paweljablonski.snkrs.di

import com.google.firebase.firestore.FirebaseFirestore
import com.paweljablonski.snkrs.repository.FirestoreFeedRepository
import com.paweljablonski.snkrs.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object AppModule {

    @Singleton
    @Provides
    fun provideFeedRepository() =
        FirestoreFeedRepository(
            sneakersRef = FirebaseFirestore.getInstance().collection(Constants.FEED_PATH)
        )
}
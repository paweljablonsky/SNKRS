package com.paweljablonski.snkrs.screens.home.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.paweljablonski.snkrs.repository.FirestoreFeedRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class FeedScreenViewModel @Inject constructor(
    private val repository: FirestoreFeedRepository
): ViewModel() {

    val responseLiveData = liveData(Dispatchers.IO) {
        emit(repository.getAllFeedsFromDatabase())
    }

}
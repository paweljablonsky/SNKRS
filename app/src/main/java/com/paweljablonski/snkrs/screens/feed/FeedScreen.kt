package com.paweljablonski.snkrs.screens.feed

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun Feed(
    navController: NavController,
    viewModel: FeedScreenViewModel = hiltViewModel()
){

    viewModel.responseLiveData.observe(LocalLifecycleOwner.current) {
        Log.d("TAG", it.toString())
    }


}


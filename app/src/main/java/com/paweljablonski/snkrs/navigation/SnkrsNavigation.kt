package com.paweljablonski.snkrs.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.paweljablonski.snkrs.screens.feed.Feed


@ExperimentalComposeUiApi
@Composable
fun SnkrsNavigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SnkrsScreens.FeedScreen.name) {

        composable(SnkrsScreens.FeedScreen.name){
            Feed(navController = navController)
        }
    }

}

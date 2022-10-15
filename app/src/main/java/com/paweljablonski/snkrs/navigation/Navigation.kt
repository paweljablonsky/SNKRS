package com.paweljablonski.snkrs.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.paweljablonski.snkrs.screens.home.feed.Feed
import com.paweljablonski.snkrs.screens.home.in_stock.InStock
import com.paweljablonski.snkrs.screens.home.upcoming.Upcoming


@ExperimentalComposeUiApi
@Composable
fun SnkrsNavigation(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.name) {

        composable(Screens.FeedScreen.name){
            Feed(navController = navController)
        }

        composable(Screens.InStockScreen.name){
            InStock(navController = navController)
        }

        composable(Screens.UpcomingScreen.name){
            Upcoming(navController = navController)
        }

         composable(Screens.HomeScreen.name){
            Upcoming(navController = navController)
        }

         composable(Screens.ExploreScreen.name){
            Upcoming(navController = navController)
        }

         composable(Screens.NotificationsScreen.name){
            Upcoming(navController = navController)
        }

         composable(Screens.UserScreen.name){
            Upcoming(navController = navController)
        }




    }
}
//fun SnkrsNavigation(){
//    val navController = rememberNavController()
//    NavHost(
//        navController = navController,
//        startDestination = SnkrsScreens.FeedScreen.name) {
//
//        composable(SnkrsScreens.FeedScreen.name){
//            Feed(navController = navController)
//        }
//
//        composable(SnkrsScreens.InStockScreen.name){
//            InStock(navController = navController)
//        }
//
//        composable(SnkrsScreens.UpcomingScreen.name){
//            Upcoming(navController = navController)
//        }
//    }
//
//}

package com.paweljablonski.snkrs.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.paweljablonski.snkrs.screens.explore.Explore
import com.paweljablonski.snkrs.screens.home.Home
import com.paweljablonski.snkrs.screens.home.feed.Feed
import com.paweljablonski.snkrs.screens.home.in_stock.InStock
import com.paweljablonski.snkrs.screens.home.upcoming.Upcoming
import com.paweljablonski.snkrs.screens.notification.Notifications
import com.paweljablonski.snkrs.screens.user.User


@ExperimentalComposeUiApi
@Composable
fun Navigation(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route) {

        composable(Screens.FeedScreen.name){
            Feed(navController = navController)
        }

        composable(Screens.InStockScreen.name){
            InStock(navController = navController)
        }

        composable(Screens.UpcomingScreen.name){
            Upcoming(navController = navController)
        }

         composable(route = BottomNavItem.Home.route){
            Home(navController = navController)
        }

         composable(route = BottomNavItem.Explore.route){
            Explore(navController = navController)
        }

         composable(route = BottomNavItem.Notifications.route){
            Notifications(navController = navController)
        }

         composable(route = BottomNavItem.UserProfile.route){
            User(navController = navController)
        }




    }
}

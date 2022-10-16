package com.paweljablonski.snkrs.navigation

enum class Screens {
    FeedScreen,
    UpcomingScreen,
    InStockScreen,
    HomeScreen,
    ExploreScreen,
    NotificationsScreen,
    UserScreen
    ;
//
//    companion object{
//        fun fromRoute(route: String): Screens
//            = when(route.substringBefore("/")){
//                FeedScreen.name -> FeedScreen
//                UpcomingScreen.name -> UpcomingScreen
//                InStockScreen.name -> InStockScreen
//                HomeScreen.name -> HomeScreen
//                ExploreScreen.name -> ExploreScreen
//                NotificationsScreen.name -> NotificationsScreen
//                UserScreen.name -> UserScreen
//                else -> throw IllegalArgumentException("Route $route is not recognized")
//            }
//    }


}
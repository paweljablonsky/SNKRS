package com.paweljablonski.snkrs.navigation

enum class SnkrsScreens {
    FeedScreen,
    UpcomingScreen,
    InStockScreen
    ;

    companion object{
        fun fromRoute(route: String): SnkrsScreens
            = when(route.substringBefore("/")){
                FeedScreen.name -> FeedScreen
                UpcomingScreen.name -> UpcomingScreen
                InStockScreen.name -> InStockScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }
}
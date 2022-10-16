package com.paweljablonski.snkrs.navigation

import com.paweljablonski.snkrs.R

sealed class BottomNavItem (
    var title: String,
    var icon: Int,
    var route: String
        ){
    object Home: BottomNavItem("Home", R.drawable.ic_home, "home")
    object Explore: BottomNavItem("Explore", R.drawable.ic_explore, "explore")
    object Notifications: BottomNavItem("Notifications", R.drawable.ic_notification, "notifications")
    object UserProfile: BottomNavItem("User Profile", R.drawable.ic_user_profile, "user_profile")
}


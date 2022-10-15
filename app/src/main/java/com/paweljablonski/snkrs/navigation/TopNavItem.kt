package com.paweljablonski.snkrs.navigation

sealed class TopNavItem (
    var title: String,
    var icon: Int,
    var route: String
        ){
    object Feed: TopNavItem("Feed", 11, "feed") // 11 -> R.drawable.ic_feed
    object Upcoming: TopNavItem("Upcoming", 11, "upcoming") // same
    object InStock: TopNavItem("In Stock", 11, "in_stock") // same
}
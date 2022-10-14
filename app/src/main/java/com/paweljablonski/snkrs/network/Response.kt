package com.paweljablonski.snkrs.network

import com.paweljablonski.snkrs.model.Feed

data class Response(
    var feeds: List<Feed>? = null,
    var exception: Exception? = null
)
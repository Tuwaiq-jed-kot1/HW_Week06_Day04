package com.sumaya.hw_week06_day03.data

data class YoutubeData (

    val videos : List<Videos>
)

data class Videos (
    val id : Int,
    val name : String,
    val link : String,
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
)

data class Channel (
    val name : String
)
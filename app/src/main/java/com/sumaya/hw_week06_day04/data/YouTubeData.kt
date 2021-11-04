package com.sumaya.hw_week06_day04.data

import com.google.gson.annotations.SerializedName

data class YouTubData(

    val videos : List<Videos>
)



data class Videos (
    val id : Int,
    val name : String,
    @SerializedName("imageUrl")
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
)


data class Channel (
    val name : String
)
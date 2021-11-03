package com.sumaya.hw_week06_day04

import com.google.gson.annotations.SerializedName

data class Json4Kotlin_Base (

    val videos : List<FlickrData>
)

data class FlickrData (

    val id : Int,
    val name : String,
   // @SerializedName("url_s")
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
    )

    data class Channel (

        val name : String
    )


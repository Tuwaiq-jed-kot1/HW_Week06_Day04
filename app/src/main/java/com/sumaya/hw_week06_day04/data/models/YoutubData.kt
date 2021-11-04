package com.sumaya.hw_week06_day04.data.models

import com.google.gson.annotations.SerializedName


data class Json4Kotlin_Base (
    val videos : List<Videos>
)



data class Videos (
    val id : Int,
    val name : String,
    val link : String,
    //@SerializedName("url_s")
    val imageUrl : String,
    val channel : Channel,
    val numberOfViews : Int
)


data class Channel (

    val name : String,
    val profileimageUrl : String,
    val numberOfSubscribers : Int
)

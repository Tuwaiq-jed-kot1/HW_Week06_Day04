package com.shady.restandretrofit.data.models

import com.google.gson.annotations.SerializedName

data class YouTubData(
    val videos : List<Videos>
)



data class Videos (
    val id : Int,
    val name : String,
    @SerializedName("imageUrl")
    val imageUrl : String,
    val channel : String,
    val numberOfViews : Int
)

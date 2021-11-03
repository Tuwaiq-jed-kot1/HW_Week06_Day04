package com.sumaya.hw_week06_day04.dataNetwork

import com.sumaya.hw_week06_day04.FlickrData
import com.sumaya.hw_week06_day04.Json4Kotlin_Base
import retrofit2.http.GET

interface FlickrAPI {

    @GET("?method=flickr.interestingness.getList&api_key=8d3844e38a47201b02204294fad8be45&format=json&nojsoncallback=1&extras=url_s")
    suspend fun fetchPhotos(): Json4Kotlin_Base

}
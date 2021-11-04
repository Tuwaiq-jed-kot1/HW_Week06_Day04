package com.sumaya.hw_week06_day04.data.network

import com.sumaya.hw_week06_day04.data.models.Json4Kotlin_Base
import retrofit2.http.GET

interface YoutubeAPI {

    @GET("?method=flickr.interestingness.getList&api_key=1429a3752b5d2658fecb7bd8d46d71bc&format=json&nojsoncallback=1&extras=url_s")
    suspend fun fetchYoutube():Json4Kotlin_Base
}
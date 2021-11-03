package com.sumaya.hw_week06_day04.data.network



import com.sumaya.hw_week06_day04.data.models.Json4Kotlin_Base
import retrofit2.http.GET

interface YoutubeAPI {
    // for a working version, add a
    @GET("?method=flickr.interestingness.getList&api_key=253ae91fed2fe9ab55e8028f7fbdb982&format=json&nojsoncallback=1&extras=url_s")
    suspend fun fetchPhotos(): Json4Kotlin_Base
}
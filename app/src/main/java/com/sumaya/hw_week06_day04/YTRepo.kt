package com.sumaya.hw_week06_day04
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
    private val tag ="YTRepo"
     val api = YTBuilder.youtubeAPI

    suspend fun fetchVideoInfo(): YTData = withContext(Dispatchers.IO) {
        api.fetchVideoInfo()
    }
}
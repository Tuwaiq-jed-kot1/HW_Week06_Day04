package com.sumaya.hw_week06_day04.modle

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YoutubeRepo {
     val api=YoutubeBuilder.youtubeAPI
    suspend fun fetchInterestingList():YoutubeData= withContext(Dispatchers.IO){
        api.fetchVideos()
    }
}
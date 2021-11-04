package com.sumaya.hw_week06_day04.Data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class youtubeRepo {
    private val tag = "VideosRepo"

    private val api = youtubeBuilder.videoAPI

    suspend fun fetchIntrestingList(): youtyubeV= withContext(Dispatchers.IO){
        api.inVideo()
    }
}
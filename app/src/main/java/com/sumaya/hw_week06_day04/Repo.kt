package com.sumaya.hw_week06_day04

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repo {
       // private val tag ="FlickerRepo"
        private val api= YoutubeBuilder.youtubeapi
        suspend fun fetshVideos():YTRoot = withContext(Dispatchers.IO){
            api.fetshVideos()}
}
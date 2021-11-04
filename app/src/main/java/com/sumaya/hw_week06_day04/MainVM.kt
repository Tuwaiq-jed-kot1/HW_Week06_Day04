package com.shady.restandretrofit.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shady.restandretrofit.data.network.YouTubeRepo
import com.sumaya.hw_week06_day04.YoutubeData
import kotlinx.coroutines.launch

class MainVM: ViewModel() {
    val repo = YouTubeRepo()
    fun fetchInterestingList(): LiveData<YoutubeData>{
        val photos = MutableLiveData<YoutubeData>()
            viewModelScope.launch {
                try {
                    photos.postValue(repo.fetchInterestingList())
                } catch (e: Throwable) {
                    Log.e("Youtube Image","Youtube Image Problem: ${e.localizedMessage}")
                }
            }
        return photos
    }

}
package com.shady.restandretrofit.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shady.restandretrofit.data.models.YouTubData
import com.shady.restandretrofit.data.network.YoutubeRepo
import kotlinx.coroutines.launch

class MainVM: ViewModel() {
    val repo = YoutubeRepo()
    fun fetchInterestingList(): LiveData<YouTubData>{
        val videos = MutableLiveData<YouTubData>()
            viewModelScope.launch {
                try {
                    videos.postValue(repo.fetchInterestingList())
                } catch (e: Throwable) {
                    Log.e("Youtube video","Youtube video Problem: ${e.localizedMessage}")
                }
            }
        return videos
    }

}
package com.sumaya.hw_week06_day04.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sumaya.hw_week06_day04.data.modules.YoutubeData
import com.sumaya.hw_week06_day04.data.network.YoutubeRepo
import kotlinx.coroutines.launch

class MainVM:ViewModel() {
    val repo = YoutubeRepo()
    fun fetchInterestingList(): LiveData<YoutubeData> {
        val videoo = MutableLiveData<YoutubeData>()
        viewModelScope.launch {
            try {
                videoo.postValue(repo.fetchInterestingList())
            }catch (e: Throwable){
                Log.e("Flickr Image","Flickr Images Problem ${e.localizedMessage}")
            }
        }
        return videoo
    }
}

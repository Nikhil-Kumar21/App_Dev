package com.iitr.memeshare

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var repository= Repository()

    var count : Int = 0
    val currentImageUrl=MutableLiveData<String>(null)
    fun getUrl(context: Context){

        currentImageUrl.value=repository.getUrl(context)
        ++count
    }

}
package com.example.imgurapp.ui.new

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NewViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun getAlubm(){
        viewModelScope.launch {
//            val album= ImgurCl?ient.api.getAlbum("OICg9SZ")
        }
    }

}
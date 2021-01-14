package com.example.melodiamusik.ui.bass

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BassViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Bass Fragment"
    }
    val text: LiveData<String> = _text
}
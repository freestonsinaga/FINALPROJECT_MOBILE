package com.example.melodiamusik.ui.keyboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KeyboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Keyboard Fragment"
    }
    val text: LiveData<String> = _text
}
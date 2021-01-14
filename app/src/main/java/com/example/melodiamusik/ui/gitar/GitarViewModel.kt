package com.example.melodiamusik.ui.gitar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GitarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Gitar Fragment"
    }
    val text: LiveData<String> = _text
}
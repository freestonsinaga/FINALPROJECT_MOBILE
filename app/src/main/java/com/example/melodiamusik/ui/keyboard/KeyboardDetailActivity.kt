package com.example.melodiamusik.ui.keyboard


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.melodiamusik.R
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.keyboard_content_detail.*

class KeyboardDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyboard_activity_detail)
//        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_COMPONENT_NAME)) {
            putData(intentThatStartedThisActivity)
        }
    }

    private fun putData(intentThatStartedThisActivity : Intent) {
        var photo = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)!!.toInt()
        var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
        var deskripsi= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EXCLUDE_COMPONENTS)
        var website = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER_NAME)
        KeyboardPhotoDetail.setImageResource(photo)
        KeyboardNamaDetail.text = nama
        KeyboardDeskripsiDetail.text = deskripsi

        }
    }


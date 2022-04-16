package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ImageButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
    }

    fun secondImageButton(view: android.view.View) {}
    fun firstImageButton(view: android.view.View) {}
}
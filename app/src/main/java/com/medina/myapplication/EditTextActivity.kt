package com.medina.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    fun register(view: android.view.View) {
        when (firstName.text.isNotBlank() && lastName.text.isNotBlank()) {
            true -> displayName.text = "Your Username is: ${firstName.text} ${lastName.text}"
            false -> displayName.text = "These fields are required"
        }
    }
}
package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class FloatingActionButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

    }

    fun action(view: android.view.View){
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show();
    }
}
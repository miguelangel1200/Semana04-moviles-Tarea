package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)


    }

    fun androidCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox -> { Toast.makeText(this, "CheckBox is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox2 -> { Toast.makeText(this, "CheckBox 2 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox3 -> { Toast.makeText(this, "CheckBox 3 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox4 -> { Toast.makeText(this, "CheckBox 4 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox5 -> { Toast.makeText(this, "CheckBox 5 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox6 -> { Toast.makeText(this, "CheckBox 6 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox7-> { Toast.makeText(this, "CheckBox 7 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox8 -> { Toast.makeText(this, "CheckBox 8 is checked", Toast.LENGTH_SHORT).show() }
            R.id.checkBox9 -> { Toast.makeText(this, "CheckBox 9 is checked", Toast.LENGTH_SHORT).show() }
        }
    }
}
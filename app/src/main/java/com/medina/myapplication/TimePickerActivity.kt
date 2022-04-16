package com.medina.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saico.componentesuitest.util.TimePickerFragment
import kotlinx.android.synthetic.main.activity_date_picker.*
import kotlinx.android.synthetic.main.activity_time_picker.*

class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
    }

    private fun pickup(){
        val timePicker = TimePickerFragment {pick(it)}
        timePicker.show(supportFragmentManager,"time")
    }



    @SuppressLint("SetTextI18n")
    private fun pick(time:String){
        textView.text = "Selected $time"
    }
}
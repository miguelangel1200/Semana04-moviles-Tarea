package com.medina.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

fun Context.formatDate(dayOfMonth: Int, month: Int, year: Int): String {
    val monthCorrect = month + 1
    return "Date: $dayOfMonth/$monthCorrect/$year"
}

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        datePicker.init(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH) { datePicker, year, month, dayOfMonth ->
            display_date.text = this.formatDate(dayOfMonth, month, year)
        }
    }

    fun pick(view: android.view.View) {
        display_date.text = this.formatDate(datePicker.dayOfMonth, datePicker.month, datePicker.year)
    }
}
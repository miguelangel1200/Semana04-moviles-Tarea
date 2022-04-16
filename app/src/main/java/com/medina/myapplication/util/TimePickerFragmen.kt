package com.saico.componentesuitest.util

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.saico.componentesuitest.R
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*




class TimePickerFragment(val listener: (String) -> Unit):DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        val dialog = TimePickerDialog(activity as Context, this, hour,minute,true)
        return dialog
    }

    override fun onTimeSet(view: TimePicker?, hour: Int, minute: Int) {
        listener("$hour:$minute")


    }

}
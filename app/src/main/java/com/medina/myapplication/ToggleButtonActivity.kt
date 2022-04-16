package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {

    val toggleOn = "Toggle is ON"
    val toggleOff = "Toggle is OF"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        toggleButton1.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> text_view1.text = toggleOn
                false -> text_view1.text = toggleOff
            }

        }

        toggleButton2.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> text_view2.text = toggleOn
                false -> text_view2.text = toggleOff
            }

        }

        toggleButton1.isChecked = true
        when (toggleButton1.isChecked) {
            true -> text_view1.text = toggleOn
            false -> text_view1.text = toggleOff
        }

        toggleButton2.isChecked = false
        when (toggleButton2.isChecked) {
            true -> text_view2.text = toggleOn
            false -> text_view2.text = toggleOff
        }

    }
}
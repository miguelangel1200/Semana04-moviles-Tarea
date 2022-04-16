package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.saico.componentesuitest.util.showToast
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        progressbar1.progress = 30
    }

    fun show(view: android.view.View) {

        val progressText = numberText.text.toString().toInt()

        if (progressText in 0..100) {
            progressbar1.progress = progressText
        } else {
            this.showToast("Número no valido")
        }
    }
}
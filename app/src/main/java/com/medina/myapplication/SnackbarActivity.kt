package com.medina.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)


        snack.setOnClickListener{
            Snackbar.make(
                coordinatorLayout,
                "Hello I'm Android SnackBar",
                Snackbar.LENGTH_SHORT
            ).setAction(
                "Show Now"
            ){
                Toast.makeText(applicationContext,"An Action Showing", Toast.LENGTH_SHORT).show()
                coordinatorLayout.setBackgroundColor(Color.parseColor("#f2f2f2"))
            }.show()
        }
    }




}

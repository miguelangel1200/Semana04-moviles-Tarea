package com.medina.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.saico.componentesuitest.util.showToast
import kotlinx.android.synthetic.main.activity_rating_bar.*

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val spinner1 = findViewById<Spinner>(R.id.spinner)

        val lista = resources.getStringArray(R.array.android_layout_arrays)

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)

        spinner1.adapter = adaptador

        spinner1.onItemSelectedListener = object:

            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
               parent: AdapterView<*>,
               view: View?,
               position: Int,
               id: Long
            ) {
                Toast.makeText(this@SpinnerActivity,"You have selected "+lista[position],Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}
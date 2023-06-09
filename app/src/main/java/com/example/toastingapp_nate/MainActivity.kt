package com.example.toastingapp_nate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //instatntiate - giving another name as variable
    private lateinit var display_text:TextView
    private lateinit var edt_input_data:EditText
    private lateinit var submitbutton:Button
    private lateinit var buttontwo:Button
    private lateinit var buttonthree:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisplay)
        edt_input_data = findViewById(R.id.edtdata)
        submitbutton = findViewById(R.id.btnsubmit)
        buttontwo = findViewById(R.id.btnsecond)
        buttonthree = findViewById(R.id.btnthird)

        submitbutton.setOnClickListener {
            Toast.makeText(this, "Welcome To My First Toast Application", Toast.LENGTH_SHORT).show()
        }
        buttontwo.setOnClickListener {
            Toast.makeText(this, "Clicked the second button", Toast.LENGTH_SHORT).show()
        }
        buttonthree.setOnClickListener {
            Toast.makeText(this, "Clicked the third button", Toast.LENGTH_SHORT).show()
        }
    }
}
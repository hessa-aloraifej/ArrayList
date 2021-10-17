package com.example.arraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name=findViewById<EditText>(R.id.name)
        var number=findViewById<EditText>(R.id.number)
        var addbtn=findViewById<Button>(R.id.button)
        var showbtn=findViewById<Button>(R.id.button2)
        var names= arrayListOf<String>()
        var nameText=findViewById<TextView>(R.id.textView3)
        addbtn.setOnClickListener {
            names.add(name.text.toString())
        }
        showbtn.setOnClickListener {
            nameText.text=names[(number.text.toString().toInt())-1]
        }
    }
}
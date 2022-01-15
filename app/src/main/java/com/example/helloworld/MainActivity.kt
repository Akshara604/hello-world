package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//onCreate comes from android.os.Bundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //sya to display activity main

        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            myTextView.text= timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hello Akshara 😀", Toast.LENGTH_SHORT).show()
        }


    }
}
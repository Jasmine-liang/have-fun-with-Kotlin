package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytextView  = findViewById(R.id.textView) as TextView
        var timeClicked = 0
        // get reference to button
        val btnclickme = findViewById(R.id.button) as Button
        // set on-click listener
        btnclickme.setOnClickListener {
            timeClicked += 1
            mytextView.text = timeClicked.toString()
            Toast.makeText(this@MainActivity, "Hey otter.", Toast.LENGTH_SHORT).show()
        }
    }
}
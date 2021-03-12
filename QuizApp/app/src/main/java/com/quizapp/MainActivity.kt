package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO TEXT COLOR TURN WHITE IN CORRECT ANSWER
        //TODO IMPROVE CODE QULITY, LIKE TURN THEN INTO FUNTIONS ETC
        //TODO ADD MORE FEARTURES LIKE: READ AND WRITE, NETWORKING ETC
        val btn_start: Button = findViewById(R.id.btn_start)
        val et_name:TextView = findViewById(R.id.et_name)
        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name",
                Toast.LENGTH_SHORT).show()
            }else
            {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())

                startActivity(intent)
                finish()
            }
        }
    }
}
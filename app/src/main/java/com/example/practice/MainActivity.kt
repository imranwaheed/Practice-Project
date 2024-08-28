  package com.example.practice

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gotonextbtn = findViewById<TextView>(R.id.gotonextbtn)
        gotonextbtn.setOnClickListener {
            intent = Intent(this@MainActivity ,SecondActivity ::class.java)
            startActivity(intent)
        }

    }
}
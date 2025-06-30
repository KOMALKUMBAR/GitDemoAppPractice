package com.task.gitdemoapppractise

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_message)
       val screen1 = findViewById<TextView>(R.id.screen1)
        val screen2 = findViewById<TextView>(R.id.screen2)
        val screen3 = findViewById<TextView>(R.id.screen3)
        val screen4 = findViewById<TextView>(R.id.screen4)
        screen1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        screen2.setOnClickListener {
            val intent = Intent(this, ScreenTwoActivity::class.java)
            startActivity(intent)
        }


    }
}
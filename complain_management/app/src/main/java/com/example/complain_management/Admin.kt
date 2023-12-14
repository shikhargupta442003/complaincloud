package com.example.complain_management

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Admin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        val servbutton = findViewById<Button>(R.id.servbutton)
        servbutton.setOnClickListener {
            val Intent32 = Intent(this, services::class.java)
            startActivity(Intent32)
        }
    }
}
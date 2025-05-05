package com.example.travello2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        val btnSignUp = findViewById<Button>(R.id.veributton)
        val txtLogin = findViewById<TextView>(R.id.hvacc)

        btnSignUp.setOnClickListener {
            val intent = Intent(this@register, login::class.java)
            startActivity(intent)
            finish()
        }


        txtLogin.setOnClickListener({ v ->
            val intent = Intent(this@register, login::class.java)
            startActivity(intent)
            finish()
            })
    }
}
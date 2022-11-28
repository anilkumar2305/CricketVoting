package com.example.cricket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity() {
    private lateinit var loginbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username: EditText = findViewById(R.id.usernamel)
        val password: EditText = findViewById(R.id.passwordl)
        loginbtn = findViewById(R.id.loginbtn)
        val signupn: TextView = findViewById(R.id.signup)

        loginbtn.setOnClickListener {
            val intent = Intent(this@login, voting::class.java)
            startActivity(intent)
        }

        signupn.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }

    }
}
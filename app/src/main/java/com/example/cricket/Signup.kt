package com.example.cricket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Signup : AppCompatActivity() {
    private lateinit var signupbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

       signupbtn=findViewById(R.id.signupbtn)

        signupbtn.setOnClickListener {
            intent=Intent(this@Signup,login::class.java)
            startActivity(intent)
        }



    }
}
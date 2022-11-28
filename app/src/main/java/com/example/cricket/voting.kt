package com.example.cricket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class voting : AppCompatActivity() {
    private lateinit var indbtn: Button
    private lateinit var engbtn: Button
    private lateinit var indt: TextView
    private lateinit var engt: TextView
    var num1=0
    var num2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voting)

        indbtn=findViewById(R.id.indb)
        engbtn=findViewById(R.id.engb)
        indt=findViewById(R.id.texti)
        engt=findViewById(R.id.texte)

        indbtn.setOnClickListener {

            num1++
            indt.text=num1.toString()
        }

        engbtn.setOnClickListener {
            num2++
            engt.text=num2.toString()
        }

    }
    }

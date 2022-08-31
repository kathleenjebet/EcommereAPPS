package com.example.ecommereapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val button_intent =findViewById<Button>(R.id.button_intent)

        button_intent.setOnClickListener{
            val button_intent = Intent(this,SplashActivity::class.java)
            startActivity(button_intent)

        }
    }
}
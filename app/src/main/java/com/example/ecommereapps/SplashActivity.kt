package com.example.ecommereapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //btn with intent



        val btn =findViewById<Button>(R.id.btn_intent)

        btn.setOnClickListener{
           val try_Intent = Intent(this,HomeActivity::class.java)
            startActivity(try_Intent)

        }

    }
}
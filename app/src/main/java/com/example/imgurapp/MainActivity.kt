package com.example.imgurapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.imgurapi.MyClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity",MyClass().name)

        Handler().postDelayed({
                              val intent=Intent(this@MainActivity,HomeActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}
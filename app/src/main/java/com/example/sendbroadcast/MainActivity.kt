package com.example.sendbroadcast

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sendbroadcast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityMainBinding.root
        setContentView(view)

        activityMainBinding.button.setOnClickListener {
            sendBroadcast()
        }
    }

    private fun sendBroadcast() {
        Intent().also { intent ->
            intent.action = "CUSTOM_NOTIFICATION"
            intent.putExtra("data", "Enviando un saludo")
            sendBroadcast(intent)
        }
    }
}
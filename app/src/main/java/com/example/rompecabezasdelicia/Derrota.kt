package com.example.rompecabezasdelicia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Derrota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_derrota)
    }

    fun otraVez(imagen: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
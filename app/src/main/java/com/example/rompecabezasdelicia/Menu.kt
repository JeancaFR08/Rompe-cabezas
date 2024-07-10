package com.example.rompecabezasdelicia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun inicioJuego(boton: View){
        //iv_iniciar.setOnClickListener{
        val intent = Intent(this, Juego::class.java)
        startActivity(intent)
        finish()
        // }
    }
}
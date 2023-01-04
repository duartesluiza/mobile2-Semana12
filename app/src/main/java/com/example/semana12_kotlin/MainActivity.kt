package com.example.semana12_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.semana12_kotlin.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login = findViewById<EditText>(id.login)
        var senha = findViewById<EditText>(id.senha)

        var btn = findViewById<Button>(id.btn)

        btn.setOnClickListener{
            if (login.text.toString().equals("luiza") && senha.text.toString().equals("123")){
                startActivity(Intent(this, formulario::class.java))
            } else {
                Toast.makeText(applicationContext, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
package com.example.semana12_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.semana12_kotlin.R.id

class formulario : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)


        var nome = findViewById<EditText>(id.nome)
        var telefone = findViewById<EditText>(id.tel)
        var idade = findViewById<EditText>(id.idade)
        var n = findViewById<TextView>(id.txtNome)
        var t = findViewById<TextView>(id.txtTel)
        var i = findViewById<TextView>(id.txtIdade)
        var btnCriar = findViewById<Button>(id.btnCriar)
        var btnMostrar = findViewById<Button>(id.btnMostrar)
        var btnLimpar = findViewById<Button>(id.btnLimpar)

        val p = Pessoa()

        btnCriar.setOnClickListener {
            p.setNome(nome.text.toString())
            p.setTelefone(telefone.text.toString())
            p.setIdade(idade.text.toString())

            Toast.makeText(applicationContext, "Dados inseridos!", Toast.LENGTH_SHORT).show()
        }

        btnMostrar.setOnClickListener {
            n.text = p.getNome()
            t.text = p.getTelefone()
            i.text = p.getIdade()
        }

        btnLimpar.setOnClickListener {
            n.text = "Nome: "
            t.text = "Telefone: "
            i.text = "Idade:"

            p.setNome("")
            p.setTelefone("")
            p.setIdade("")

            nome.text.clear()
            telefone.text.clear()
            idade.text.clear()
        }
    }
}
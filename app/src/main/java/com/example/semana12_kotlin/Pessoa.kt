package com.example.semana12_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pessoa : AppCompatActivity() {
    private var nome: String = ""
    private var idade: String = ""
    private var telefone: String = ""


    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome: String){
        this.nome = nome

    }

    fun getIdade(): String{
        return this.idade
    }

    fun setIdade(idade: String){
        this.idade = idade
    }

    fun getTelefone(): String{
        return this.telefone
    }

    fun setTelefone(telefone: String){
        this.telefone = telefone
    }
}
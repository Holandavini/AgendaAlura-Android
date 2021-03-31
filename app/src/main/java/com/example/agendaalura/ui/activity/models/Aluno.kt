package com.example.agendaalura.ui.activity.models

data class Aluno(val nome: String,val phone: String,val email: String){
    override fun toString(): String {
        return nome
    }
}
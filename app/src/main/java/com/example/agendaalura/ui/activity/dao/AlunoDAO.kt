package com.example.agendaalura.ui.activity.dao

import com.example.agendaalura.ui.activity.models.Aluno


class AlunoDAO {
    companion object{
        val alunos = arrayListOf<Aluno>()

        fun salvar(aluno: Aluno){
            alunos.add(aluno)
        }

        fun getAlunos(): List<Aluno>{
            val listaAlunos = alunos
            return listaAlunos
        }
    }
}

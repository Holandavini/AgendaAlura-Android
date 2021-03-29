package com.example.agendaalura.ui.activity.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.agendaalura.R
import com.example.agendaalura.ui.activity.models.Aluno
import com.example.agendaalura.ui.activity.dao.AlunoDAO

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)

        val dao = AlunoDAO

        val btnSalvarAluno = findViewById<Button>(R.id.activity_formulario_aluno_botao_salvar)
        val nomeCampo = findViewById<EditText>(R.id.activity_formulario_aluno_nome)
        val phoneCampo = findViewById<EditText>(R.id.activity_formulario_aluno_telefone)
        val emailCampo = findViewById<EditText>(R.id.activity_formulario_aluno_email)

        btnSalvarAluno.setOnClickListener {
            val nomeAluno = nomeCampo.text.toString()
            val phoneAluno = phoneCampo.text.toString()
            val emailAluno = emailCampo.text.toString()

            dao.salvar(Aluno(nomeAluno, phoneAluno, emailAluno))

            startActivity(Intent(this, ListaAlunosActivity::class.java))
        }
    }
}
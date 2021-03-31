package com.example.agendaalura.ui.activity.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.agendaalura.R
import com.example.agendaalura.ui.activity.dao.AlunoDAO
import com.example.agendaalura.ui.activity.models.Aluno
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaAlunosActivity : AppCompatActivity() {
    private val TITLE_APPBAR = "Lista de alunos"
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        val btnNovoAluno = findViewById<FloatingActionButton>(R.id.activity_lista_de_alunos_fab_novo_aluno)
        btnNovoAluno.setOnClickListener {
            startActivity(Intent(this, FormularioAlunoActivity::class.java))
        }
        val dao = AlunoDAO
        dao.salvar(Aluno("Vinicius", "1122223333", "aluno@aluno.com.br"))

    }

    override fun onResume() {
        super.onResume()
        val alunos = AlunoDAO
        title = TITLE_APPBAR
        // Indicar a list view
        val listaDeAlunos: ListView  = findViewById(R.id.alunos_view)
        // criar adapter para poder usar no listview
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,alunos.getAlunos())
        listaDeAlunos.adapter = adapter

        listaDeAlunos.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItemText = parent.getItemAtPosition(position)
           Log.i("Lista", "" + position)
        }

    }
}


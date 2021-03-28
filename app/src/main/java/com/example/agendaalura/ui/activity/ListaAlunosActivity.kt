package com.example.agendaalura.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.agendaalura.R

class ListaAlunosActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)
        title = "Lista de alunos"
        // Indicar a list view
        listView = findViewById(R.id.alunos_view)
        // Mock alunos
        val alunos = mutableListOf("Vinicius", "Kessy", "Thalita", "Theodora")
        // criar adapter para poder usar no listview
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,alunos)
        listView.adapter = adapter
    }
}


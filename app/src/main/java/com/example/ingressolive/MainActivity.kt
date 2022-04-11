package com.example.ingressolive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ingressolive.Adapter.AdapterProduto
import com.example.ingressolive.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview_produtos = findViewById<RecyclerView>(R.id.recyclerview_produtos)
        recyclerview_produtos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview_produtos.setHasFixedSize(true)

        //configurar o Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos)
        recyclerview_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.ingresso1,
            "Festa Junina",
        "Uberlandia-MG",
        "30 de Junho",
        R.drawable.ic_music)
        listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.ingresso2,
        "FlashBack",
        "São Paulo-SP",
        "25 de Maio",
            R.drawable.ic_happy
        )
        listaProdutos.add(produto2)
    }
}
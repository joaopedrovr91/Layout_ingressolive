package com.example.ingressolive.Adapter

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ingressolive.R
import com.example.ingressolive.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagem = itemView.findViewById<ImageView>(R.id.imagem)
        val nome = itemView.findViewById<TextView>(R.id.titulo)
        val local = itemView.findViewById<TextView>(R.id.local)
        val data = itemView.findViewById<TextView>(R.id.data)
        val icone = itemView.findViewById<ImageView>(R.id.icone)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.ingresso_item, parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.imagem.setImageResource(produtos[position].imagem)
        holder.nome.text = produtos[position].nome
        holder.local.text = produtos[position].local
        holder.data.text = produtos[position].data
        holder.icone.setImageResource(produtos[position].icone)
    }

    override fun getItemCount(): Int = produtos.size
}
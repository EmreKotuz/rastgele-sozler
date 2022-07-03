package com.example.rastgelesozler

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mukemmelyazilar.PostMode
import com.example.rastgelesozler.R
import org.w3c.dom.Text

class PostAdaptor(val postMode: MutableList<PostMode>):RecyclerView.Adapter<PostViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post,parent,false)
        return PostViewHolder(view)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postMode[position])
    }

    override fun getItemCount(): Int {
        return postMode.size
    }
}

class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    val tvBody: TextView = itemView.findViewById(R.id.tvBody)
    val pos: TextView = itemView.findViewById(R.id.inst)

    fun bindView(postMode: PostMode) {
        tvTitle.text = "@"+postMode.kullanici_adi
        tvBody.text = postMode.durum


    }


}
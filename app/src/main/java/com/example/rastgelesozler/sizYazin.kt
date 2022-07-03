package com.example.rastgelesozler

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mukemmelyazilar.PostMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class sizYazin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siz_yazin)
        val serviceGenerator = services.buildService(ApiServices::class.java)
        val call = serviceGenerator.getPosts()
        val recyclerView = findViewById<RecyclerView>(R.id.recylerView)
        val blog = findViewById<TextView>(R.id.blog)
        val yazi = findViewById<TextView>(R.id.yaziEkle3)
        val yazisil = findViewById<TextView>(R.id.yaziSil)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        /*
            inst.setOnClickListener {
            Toast.makeText(this,"hey", Toast.LENGTH_SHORT).show()
            }
        * */
        blog.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teknoek.com"))
            startActivity(i)
        }
        yazi.setOnClickListener {
            var intent = Intent(this, yaziEkleActivity::class.java)
            startActivity(intent)
        }
        yazisil.setOnClickListener {

            var a = Intent(this, yaziSilActivity::class.java)
            startActivity(a)
        }
        call.enqueue(object : Callback<MutableList<PostMode>> {
            override fun onResponse(
                call: Call<MutableList<PostMode>>,
                response: Response<MutableList<PostMode>>
            ) {
                if (response.isSuccessful) {
                    progressBar.visibility = View.INVISIBLE
                    recyclerView.apply {
                        layoutManager = LinearLayoutManager(this@sizYazin)
                        adapter = PostAdaptor(response.body()!!)
                    }
                }
            }

            override fun onFailure(call: Call<MutableList<PostMode>>, t: Throwable) {
                t.printStackTrace()
                progressBar.visibility = View.VISIBLE

            }

        })

    }
}
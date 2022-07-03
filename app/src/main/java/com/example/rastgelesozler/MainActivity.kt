package com.example.rastgelesozler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val modcu = findViewById<TextView>(R.id.modAc)
        val agir = findViewById<TextView>(R.id.agirSoz)
        val durum = findViewById<TextView>(R.id.durum)
        val sarki = findViewById<TextView>(R.id.sarki)
        val kisa = findViewById<TextView>(R.id.kisa)
        val anlamli = findViewById<TextView>(R.id.anlamli)
        val sizYazin = findViewById<TextView>(R.id.sizyazin)

        modcu.setOnClickListener {
            var intent = Intent(this,modBulucu::class.java)
            startActivity(intent)
        }
        agir.setOnClickListener {
            var intent = Intent(this,agirSozler::class.java)
            startActivity(intent)
        }
        durum.setOnClickListener {
            var intent = Intent(this,durumsozleri::class.java)
            startActivity(intent)
        }
        sarki.setOnClickListener {
            var intent = Intent(this,sarkiSozleri::class.java)
            startActivity(intent)
        }
        kisa.setOnClickListener {
            var intent = Intent(this,kisaSozler::class.java)
            startActivity(intent)
        }
        anlamli.setOnClickListener {
            var intent = Intent(this,anlamliSozler::class.java)
            startActivity(intent)
        }
        sizYazin.setOnClickListener {
            var intent = Intent(this,com.example.rastgelesozler.sizYazin::class.java)
            startActivity(intent)
        }
    }
}
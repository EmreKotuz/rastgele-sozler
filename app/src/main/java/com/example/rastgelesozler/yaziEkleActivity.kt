package com.example.rastgelesozler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class yaziEkleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yazi_ekle2)
        val i = findViewById<WebView>(R.id.webView)

        i.loadUrl("https://not.teknoek.com/yazi-yaz.php")
    }
}
package com.example.rastgelesozler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class yaziSilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yazi_sil2)
        val i = findViewById<WebView>(R.id.webView2)

        i.loadUrl("https://not.teknoek.com/yazi-sil.php")
    }
}
package com.example.practice

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val webView = findViewById<WebView>(R.id.webview)

        webView.webViewClient= WebViewClient()

        webView.loadUrl("https://github.com/imranwaheed")

        //url is changed now


    }
}
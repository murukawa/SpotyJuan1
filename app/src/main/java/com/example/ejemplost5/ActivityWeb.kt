package com.example.ejemplost5

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.widget.SearchView
import kotlinx.android.synthetic.main.activity_web.*

class ActivityWeb : AppCompatActivity() {
    private val BASE_URL = "https://www.google.es"
    private val SEARCH_PATH = "/search?q="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val settings = webView.settings
        settings.javaScriptEnabled = true
        swipeRefresh.setOnRefreshListener { webView.reload() }
        webView.webChromeClient = object : WebChromeClient() {}
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return false
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                searchView.setQuery(url, false)
                swipeRefresh.isRefreshing = true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                swipeRefresh.isRefreshing = false
            }

        }
        webView.loadUrl(BASE_URL)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    if (URLUtil.isValidUrl(query)) {
                        webView.loadUrl(query)
                        return true;
                    } else {
                        webView.loadUrl(BASE_URL + SEARCH_PATH + query)
                        return true
                    }
                }
                return false
                TODO("Not yet implemented")
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
                TODO("Not yet implemented")
            }
        })
    }


    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
package com.example.webview_search

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webSetting = webView.getSettings()

        webSetting.javaScriptEnabled

        //setContentView(webView)

        webView.setWebViewClient(WebViewClient())

        //搜尋資料

        button.setOnClickListener {
            webView.loadUrl("https://www.google.com/search?q="+ editText.text.toString())
        }

        //InputMethodManager

        val imm :InputMethodManager= getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager

        //第二个参数提供一些额外的操作标记（additional operating flags），
        // 可以取0或者SHOW_IMPLICIT，0表示什么含义没有说明，SHOW_IMPLICIT表
        // 示本次显示软键盘的请求不是来自用户的直接请求，而是隐式的请求。且不说一会用数字，一会用常量名

          imm.showSoftInput(editText,0)



    }
}

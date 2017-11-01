package br.com.disapps.kotlinextensionsfunctionsexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_browser.setOnClickListener { browser("http://google.com.br") }
        button_toast.setOnClickListener { toast("Eu sou um toast") }
    }
}

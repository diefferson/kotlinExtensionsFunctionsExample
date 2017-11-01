package br.com.disapps.kotlinextensionsfunctionsexample

import android.app.Activity
import android.widget.Toast
import android.content.Intent
import android.net.Uri

fun Activity.toast(message : String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.browser(url : String){
    val i = Intent(Intent.ACTION_VIEW)
    i.data = Uri.parse(url)
    startActivity(i)
}
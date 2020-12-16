package com.example.myapplication3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginevent(view: View) {
        var getuname=findViewById<EditText>(R.id.uname)
        var getpass=findViewById<EditText>(R.id.txtpass)

     Toast.makeText(this,getuname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpass.text.toString(),Toast.LENGTH_LONG).show()
    }
    fun regevent(view: View)
    {
        intent= Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}
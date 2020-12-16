package com.example.myapplication3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun backhome(view: View){
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun regevent(view: View){
        var gettextname=findViewById<EditText>(R.id.textname)
        var  getphone=findViewById<EditText>(R.id.phone)
        var getuname=findViewById<EditText>(R.id.uname)
       var getemail= findViewById<EditText>(R.id.email)
        var getpass=findViewById<EditText>(R.id.txtpass)
        Toast.makeText(this,gettextname.text.toString(),Toast.LENGTH_LONG).show()
    }
}

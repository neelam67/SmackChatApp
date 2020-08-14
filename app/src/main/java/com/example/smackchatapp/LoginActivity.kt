package com.example.smackchatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onLoginClickedFromLoginPage(view: View){

    }

    fun onSignUpClickedFrmLoginPage(view : View){
        startActivity(Intent(this, CreateUserActivity::class.java))
    }
}
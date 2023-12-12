package com.example.zinebregouikotlinassignement02

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        var username = findViewById<EditText>(R.id.loginUsernameID)
        var password = findViewById<EditText>(R.id.loginPasswordID)
        var login = findViewById<Button>(R.id.loginButtonID)
        var signup = findViewById<TextView>(R.id.ifNoAccountID)

        login.setOnClickListener {
            val un = username.text.toString()
            val ps = password.text.toString()

            if (un.isEmpty() || ps.isEmpty()){
                Toast.makeText(this, "Please fill out the entire form", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent (this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        signup.setOnClickListener {
            val intent = Intent (this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
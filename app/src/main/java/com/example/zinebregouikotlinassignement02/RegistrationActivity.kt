package com.example.zinebregouikotlinassignement02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        supportActionBar?.hide()

        val username = findViewById<EditText>(R.id.signupUsernameID)
        val email = findViewById<EditText>(R.id.signupEmailID)
        val number = findViewById<EditText>(R.id.signupNumberID)
        val password = findViewById<EditText>(R.id.signupPasswordID)
        val create = findViewById<Button>(R.id.signupButtonID)
        val login = findViewById<TextView>(R.id.ifAccountID)

        create.setOnClickListener {
            val un = username.text.toString()
            val Email = email.text.toString()
            val phone = number.text.toString()
            val ps = password.text.toString()

            if (un.isEmpty() || Email.isEmpty() || phone.isEmpty() || ps.isEmpty()){
                Toast.makeText(this, "Please fill out the entire form", Toast.LENGTH_LONG).show()
            }else{
                if (password.length()<8){
                    Toast.makeText(this, "Password must be more than 8 characters", Toast.LENGTH_LONG).show()
                }else{
                    val intent = Intent (this, LoginActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Account created", Toast.LENGTH_LONG).show()
                    finish()
                }
            }
            }

        login.setOnClickListener {
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

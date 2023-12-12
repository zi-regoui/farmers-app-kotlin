package com.example.zinebregouikotlinassignement02

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navigation = findViewById<NavigationView>(R.id.navView)

        toggle = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        navigation.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile -> {
                    Toast.makeText(this, "THIS WILL OPEN THE PROFILE PAGE", Toast.LENGTH_LONG).show()
                }
                R.id.settings -> {
                    Toast.makeText(this, "THIS WILL OPEN THE SETTINGS PAGE", Toast.LENGTH_LONG).show()
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected (item:MenuItem): Boolean{
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
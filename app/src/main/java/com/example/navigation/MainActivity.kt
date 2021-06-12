package com.example.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.nav)


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.setting -> {
                    val intent=Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                    true
                }
                R.id.profile -> {
                    val intent=Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                    true
                }
                R.id.exit -> {
                    val intent=Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }

        }
    }
}

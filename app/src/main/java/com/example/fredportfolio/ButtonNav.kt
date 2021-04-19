package com.example.fredportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class ButtonNav : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
 private lateinit var buttonNav:ButtonNav
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_nav)

    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.homepage ->{
                val intentTextView= Intent(this@ButtonNav,HomePage::class.java)
                startActivity(intentTextView)
            }
            R.id.contact_us ->{
                val intentTextView= Intent(this@ButtonNav,Contact_us::class.java)
                startActivity(intentTextView)
            }
            R.id.about ->{
                val intentTextView= Intent(this@ButtonNav, AboutUs::class.java)
                startActivity(intentTextView)
            }
        }
        return true
    }
}
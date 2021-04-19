package com.example.fredportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    lateinit var drawer: DrawerLayout
    lateinit var navview:NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawer=findViewById(R.id.drawerLayout)
        navview=findViewById(R.id.navview)

       toggle=ActionBarDrawerToggle(this,drawer,R.string.open,R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navview.setNavigationItemSelectedListener{
            when(it.itemId){
                R.id.homepage->{
                        val intentHome= Intent(this@MainActivity,HomePage::class.java)
                        startActivity(intentHome)
                }
                R.id.contact_us->{
                    val intentContact_us= Intent(this@MainActivity,Contact_us::class.java)
                    startActivity(intentContact_us)

                }
                R.id.about->{
                    val intentAboutUs= Intent(this@MainActivity,AboutUs::class.java)
                    startActivity(intentAboutUs)
                }

//                R.id.homepage->Toast.makeText(applicationContext,"clicked",Toast.LENGTH_LONG).show()
//                R.id.contact_us->Toast.makeText(applicationContext,"clicked",Toast.LENGTH_LONG).show()
//                R.id.about->Toast.makeText(applicationContext,"clicked",Toast.LENGTH_LONG).show()
            }
            true

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
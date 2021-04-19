package com.example.fredportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Contact_us : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        button =findViewById(R.id.button)
button.setOnClickListener(View.OnClickListener {
    Toast.makeText(this,"fredfred",Toast.LENGTH_LONG).show()
})

    }
}
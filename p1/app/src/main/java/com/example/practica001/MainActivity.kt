package com.example.practica001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked (view: View) {
        print("button clicked!!!")
        val label = findViewById<TextView>(R.id.lbMain)
        label.text = "Hello this text was changed from code"

    }
}
package com.example.jobik

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SheetActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seet_main)
    }

    val btn = findViewById<Button>(R.id.button_main)


}

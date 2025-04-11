package com.example.myquizapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var selectedFighter: ImageView
    private lateinit var jinSelector: ImageView
    private lateinit var lawSelector: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tekken_fighter)

        selectedFighter = findViewById(R.id.iv_selected_fighter)
        jinSelector = findViewById(R.id.iv_fighter1)
        lawSelector = findViewById(R.id.iv_fighter2)

        // ✅ Set both fighter selector thumbnails here
        jinSelector.setImageResource(R.drawable.jin_kazama_selector)
        lawSelector.setImageResource(R.drawable.marshall_law_selector)

        // ✅ Set full-size fighter when clicked
        jinSelector.setOnClickListener {
            selectedFighter.setImageResource(R.drawable.jin_kazama)
        }

        lawSelector.setOnClickListener {
            selectedFighter.setImageResource(R.drawable.marshall_law)
        }
    }
}

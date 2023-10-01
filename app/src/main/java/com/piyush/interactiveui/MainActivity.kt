package com.piyush.interactiveui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonLight=findViewById<Button>(R.id.btnLight)
        val layout =findViewById<LinearLayout>(R.id.layout)

        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        buttonLight.setOnClickListener {
            layout.setBackgroundResource(androidx.appcompat.R.color.abc_background_cache_hint_selector_material_light)
        }

    }
}
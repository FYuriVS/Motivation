package com.yurivital.motivation

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yurivital.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()
        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
    if(view.id == R.id.button_new_phrase){
        var s = ""
    }
    }
}
package com.zlk.challenger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zlk.challenger.databinding.AppActivityBinding


class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
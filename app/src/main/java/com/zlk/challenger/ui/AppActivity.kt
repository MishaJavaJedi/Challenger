package com.zlk.challenger.ui

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import com.zlk.challenger.R
import com.zlk.challenger.databinding.AppActivityBinding
import com.zlk.challenger.databinding.ChallengeCardBinding


class AppActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}
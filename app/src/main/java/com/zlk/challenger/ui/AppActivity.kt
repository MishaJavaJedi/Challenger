package com.zlk.challenger.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import com.zlk.challenger.databinding.AppActivityBinding
import com.zlk.challenger.viewModel.ChallengeViewModel


class AppActivity : AppCompatActivity() {

    private val viewModel by viewModels<ChallengeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = AppActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
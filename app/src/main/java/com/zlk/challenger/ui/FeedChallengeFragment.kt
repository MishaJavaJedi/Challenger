package com.zlk.challenger.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.listener.CarouselListener
import com.aemerse.slider.model.CarouselItem
import com.zlk.challenger.R
import com.zlk.challenger.databinding.FeedChallengeFragmentBinding
import com.zlk.challenger.viewModel.ChallengeViewModel

class FeedChallengeFragment : Fragment(R.layout.feed_challenge_fragment) {

    private val viewModel by activityViewModels<ChallengeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FeedChallengeFragmentBinding.inflate(layoutInflater, container, false).also { binding ->

        viewModel.initCarousel()

        val carousel: ImageCarousel = binding.carousel
        carousel.registerLifecycle(lifecycle)

        binding.carousel.apply {
            carouselListener = object : CarouselListener {
                override fun onClick(position: Int, carouselItem: CarouselItem) {
                    binding.countdownText.text = position.toString()
                }
            }
        }

        carousel.setData(viewModel.carouselItemList)
    }.root
}
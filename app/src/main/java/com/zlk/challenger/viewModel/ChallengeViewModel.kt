package com.zlk.challenger.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.model.CarouselItem
import com.zlk.challenger.R
import com.zlk.challenger.data.impl.ChallengeRepositoryImpl
import com.zlk.challenger.db.AppDb
import com.zlk.challenger.repository.ChallengeRepository

class ChallengeViewModel(application: Application) : AndroidViewModel(application) {


    private val repository: ChallengeRepository =
        ChallengeRepositoryImpl(dao = AppDb.getInstance(context = application).challengeDao)

    //для получения get()
    val data by repository::data




    val carouselItemList = mutableListOf<CarouselItem>()

    fun initCarousel() {
// Image URL with caption
        carouselItemList.add(
            CarouselItem(

                imageUrl = "https://images.unsplash.com/photo-1532581291347-9c39cf10a73c?w=1080",
                caption = "Photo by Aaron Wu on Unsplash"
            )
        )

// Just image URL
        carouselItemList.add(
            CarouselItem(
                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080"
            )
        )

        // Image URL with header
        val headers = mutableMapOf<String, String>()
        headers["header_key"] = "header_value"

        carouselItemList.add(
            CarouselItem(
                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080",
                headers = headers
            )
        )

        /**
// Image drawable with caption
        carouselItemList.add(
            CarouselItem(
                imageDrawable = R.drawable.ic_favorite_off_24dp,
                caption = "Photo by Kimiya Oveisi on Unsplash"
            )
        )

// Just image drawable
        carouselItemList.add(
            CarouselItem(
                imageDrawable = R.drawable.ic_favorite_on_24dp
            )
        )
*/

//Trying add card from DB

    }
}
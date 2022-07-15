package com.zlk.challenger.repository

import androidx.lifecycle.LiveData
import com.zlk.challenger.data.ChallengeCard

interface ChallengeRepository {

    val data: LiveData<List<ChallengeCard>>

    fun getData()

    companion object {
        const val NEW_CHALLENGE_ID = 0L
    }
}
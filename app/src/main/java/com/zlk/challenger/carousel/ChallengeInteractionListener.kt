package com.zlk.challenger.carousel

import com.zlk.challenger.data.ChallengeCard

interface ChallengeInteractionListener {
    fun onShowClicked(challengeCard: ChallengeCard)
}
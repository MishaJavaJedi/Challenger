package com.zlk.challenger.data


data class ChallengeCard
    (
    val id: Long,
    val title: String,
    val content: String,
    val type: String,
    val isFavorite: Boolean = false,
    val isDone: Boolean = false
)

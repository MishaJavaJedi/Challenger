package com.zlk.challenger.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class ChallengeCard
    (
    val id: Long,
    val title: String,
    val content: String,
    val type: String,
    val isFavorite: Boolean = false,
    val isDone: Boolean = false,
    val imageUrl: String
) : Parcelable

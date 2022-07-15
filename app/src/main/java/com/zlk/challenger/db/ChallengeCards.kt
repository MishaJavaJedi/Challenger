package com.zlk.challenger.db

import com.zlk.challenger.data.ChallengeCard

internal fun ChallengeCardEntity.toModel() = ChallengeCard(
    id= id,
    title = title,
    content = content,
    type = type,
    isFavorite = isFavorite,
    isDone = isDone
)
internal fun ChallengeCard.toEntity() = ChallengeCardEntity(
    id = id,
    title = title,
    content = content,
    type = type,
    isFavorite = isFavorite,
    isDone = isDone
)
package com.zlk.challenger.data.impl

import android.util.Log
import androidx.lifecycle.map
import com.zlk.challenger.data.ChallengeCard
import com.zlk.challenger.db.ChallengeCardDao
import com.zlk.challenger.db.toEntity
import com.zlk.challenger.db.toModel
import com.zlk.challenger.repository.ChallengeRepository

class ChallengeRepositoryImpl(
    private val dao: ChallengeCardDao
    ):ChallengeRepository {

    override var data = dao.getAll().map { entities ->
        entities.map { it.toModel() }
    }

//    override fun getData() {
//        data = dao.getAll().map { entities -> entities.map { it.toModel() } }
//    }

    override fun save(challengeCard: ChallengeCard) {
       dao.save( challengeCard = challengeCard.toEntity())
    }


}
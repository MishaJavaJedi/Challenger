package com.zlk.challenger.data.impl

import androidx.lifecycle.map
import com.zlk.challenger.db.ChallengeCardDao
import com.zlk.challenger.db.toModel
import com.zlk.challenger.repository.ChallengeRepository

class ChallengeRepositoryImpl(
    private val dao: ChallengeCardDao
    ):ChallengeRepository {

    override var data = dao.getAll().map { entities ->
        entities.map { it.toModel() }
    }

    override fun getData() {
        TODO("Not yet implemented")
    }
}
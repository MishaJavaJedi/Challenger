package com.zlk.challenger.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
@Dao
interface ChallengeCardDao {
    @Query("SELECT * FROM ChallengeCards ORDER BY id DESC")
    fun getAll(): LiveData<List<ChallengeCardEntity>>
}
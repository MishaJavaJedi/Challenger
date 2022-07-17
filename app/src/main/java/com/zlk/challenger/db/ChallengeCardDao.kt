package com.zlk.challenger.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface ChallengeCardDao {
    @Query("SELECT * FROM challenges")
    fun getAll(): LiveData<List<ChallengeCardEntity>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(challengeCard: ChallengeCardEntity)

}
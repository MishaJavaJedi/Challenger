package com.zlk.challenger.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "ChallengeCards")
class ChallengeCardEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "content")
    val  content: String,
    @ColumnInfo(name = "type")
    val type: String,
    @ColumnInfo(name = "isFavorite")
    val isFavorite:Boolean,
    @ColumnInfo(name = "isDone")
    val isDone:Boolean
) {
}
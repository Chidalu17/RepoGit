package com.example.repogit.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Class which provides a model for post
 * @constructor Sets all properties of the post
 * @property userId the unique identifier of the author of the post
 * @property id the unique identifier of the post
 * @property title the title of the post
 * @property body the content of the post
 */
@Entity(
    tableName = "repo"
)
data class Repo(
    @field:PrimaryKey
    @ColumnInfo(name ="id")
    val id: Int,
    @ColumnInfo(name ="name")
    val name: String,
    @ColumnInfo(name ="desc")
    val description: String
)
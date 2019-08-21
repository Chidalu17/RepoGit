package com.example.repogit.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.repogit.model.Repo
import com.example.repogit.model.RepoDao

@Database(entities = [Repo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun repoDao(): RepoDao
}
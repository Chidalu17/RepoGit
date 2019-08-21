package com.example.repogit.injection

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.repogit.model.database.AppDatabase
import com.example.repogit.ui.repo.RepoListViewModel

class ViewModelFactory(private val activity: AppCompatActivity): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RepoListViewModel::class.java)) {
            val db = Room.databaseBuilder(activity.applicationContext, AppDatabase::class.java, "repos").build()
            @Suppress("UNCHECKED_CAST")
            return RepoListViewModel(db.repoDao()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}
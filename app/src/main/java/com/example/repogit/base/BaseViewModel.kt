package com.example.repogit.base

import androidx.lifecycle.ViewModel
import com.example.repogit.injection.component.DaggerViewModelInjector
import com.example.repogit.injection.component.ViewModelInjector
import com.example.repogit.injection.module.NetworkModule
import com.example.repogit.ui.repo.RepoListViewModel
import com.example.repogit.ui.repo.RepoViewModel

abstract class BaseViewModel: ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is RepoListViewModel -> injector.inject(this)
            is RepoViewModel -> injector.inject(this)
        }
    }
}
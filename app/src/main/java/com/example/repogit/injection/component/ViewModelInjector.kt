package com.example.repogit.injection.component

import com.example.repogit.injection.module.NetworkModule
import com.example.repogit.ui.repo.RepoListViewModel
import com.example.repogit.ui.repo.RepoViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(repoListViewModel: RepoListViewModel)
    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(repoViewModel: RepoViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}
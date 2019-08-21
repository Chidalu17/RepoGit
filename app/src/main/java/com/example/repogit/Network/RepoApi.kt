package com.example.repogit.Network

import com.example.repogit.model.Repo
import io.reactivex.Observable
import retrofit2.http.GET

interface RepoApi {
    @GET("/repositories")
    fun getRepos(): Observable<List<Repo>>
}
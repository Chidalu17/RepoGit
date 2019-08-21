package com.example.repogit.ui.repo

import androidx.lifecycle.MutableLiveData
import com.example.repogit.base.BaseViewModel
import com.example.repogit.model.Repo

class RepoViewModel: BaseViewModel() {
    private val repoTitleName = MutableLiveData<String>()
    private val repoDescription = MutableLiveData<String>()


    fun bind(repo: Repo){
        repoTitleName.value = repo.name
        repoDescription.value = repo.description

    }

    fun getRepoTitleName():MutableLiveData<String>{
        return repoTitleName
    }

    fun getRepoDescription():MutableLiveData<String>{
        return repoDescription
    }


}
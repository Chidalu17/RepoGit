package com.example.repogit.ui.repo

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.example.repogit.Network.RepoApi
import com.example.repogit.R
import com.example.repogit.base.BaseViewModel
import com.example.repogit.model.Repo
import com.example.repogit.model.RepoDao
import io.reactivex.Observable
import io.reactivex.Observable.concat
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class RepoListViewModel(private val repoDao: RepoDao): BaseViewModel(){
    @Inject
    lateinit var repoApi: RepoApi
    val repoListAdapter: RepoListAdapter = RepoListAdapter()

    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    val errorMessage:MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadRepos() }

    private var compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun loadRep(){
        Log.e("Seeee", "meeee")
        loadRepos()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


    private fun loadRepos(){

        Log.e("seer", "meer")
       // val item1=repoApi.getRepos()
       // val item2 = Observable.fromCallable { repoDao.all }.concatMap { repoApi.getRepos().concatMap{
              //  apiRepoList -> repoDao.insertAll(*apiRepoList.toTypedArray())
       //Observable.just(apiRepoList)}}
       // val repoList = repoDao.insertAll(repoApi.getRepos() as Repo)
       // val item2 = Observable.fromCallable { repoDao.all }.isEmpty


        val disposable = repoApi.getRepos()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { onRetrieveRepoListStart() }
            .doOnTerminate { onRetrieveRepoListFinish() }
            .subscribe(
                { result -> onRetrieveRepoListSuccess(result as List<Repo>) },
                { onRetrieveRepoListError() }
            )
        compositeDisposable.add(disposable)

    }

    private fun onRetrieveRepoListStart(){
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrieveRepoListFinish(){
        loadingVisibility.value = View.GONE
    }

    private fun onRetrieveRepoListSuccess(repoList:List<Repo>){
        Log.e("LIST", repoList.toString())
        repoListAdapter.updateRepoList(repoList)
    }

    private fun onRetrieveRepoListError(){
        errorMessage.value = R.string.post_error

    }

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo != null && connectivityManager.activeNetworkInfo.isConnected
    }
}
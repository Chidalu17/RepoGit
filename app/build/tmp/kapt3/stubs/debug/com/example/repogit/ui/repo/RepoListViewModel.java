package com.example.repogit.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\u0016\u0010\'\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/example/repogit/ui/repo/RepoListViewModel;", "Lcom/example/repogit/base/BaseViewModel;", "repoDao", "Lcom/example/repogit/model/RepoDao;", "(Lcom/example/repogit/model/RepoDao;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "errorClickListener", "Landroid/view/View$OnClickListener;", "getErrorClickListener", "()Landroid/view/View$OnClickListener;", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "loadingVisibility", "getLoadingVisibility", "repoApi", "Lcom/example/repogit/Network/RepoApi;", "getRepoApi", "()Lcom/example/repogit/Network/RepoApi;", "setRepoApi", "(Lcom/example/repogit/Network/RepoApi;)V", "repoListAdapter", "Lcom/example/repogit/ui/repo/RepoListAdapter;", "getRepoListAdapter", "()Lcom/example/repogit/ui/repo/RepoListAdapter;", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "loadRep", "", "loadRepos", "onCleared", "onRetrieveRepoListError", "onRetrieveRepoListFinish", "onRetrieveRepoListStart", "onRetrieveRepoListSuccess", "repoList", "", "Lcom/example/repogit/model/Repo;", "app_debug"})
public final class RepoListViewModel extends com.example.repogit.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.repogit.Network.RepoApi repoApi;
    @org.jetbrains.annotations.NotNull()
    private final com.example.repogit.ui.repo.RepoListAdapter repoListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener errorClickListener = null;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final com.example.repogit.model.RepoDao repoDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.repogit.Network.RepoApi getRepoApi() {
        return null;
    }
    
    public final void setRepoApi(@org.jetbrains.annotations.NotNull()
    com.example.repogit.Network.RepoApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.repogit.ui.repo.RepoListAdapter getRepoListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getErrorClickListener() {
        return null;
    }
    
    public final void loadRep() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void loadRepos() {
    }
    
    private final void onRetrieveRepoListStart() {
    }
    
    private final void onRetrieveRepoListFinish() {
    }
    
    private final void onRetrieveRepoListSuccess(java.util.List<com.example.repogit.model.Repo> repoList) {
    }
    
    private final void onRetrieveRepoListError() {
    }
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public RepoListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.repogit.model.RepoDao repoDao) {
        super();
    }
}
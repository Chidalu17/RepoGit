package com.example.repogit.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/repogit/ui/repo/RepoListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/repogit/databinding/ActivityRepoListBinding;", "errorSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "viewModel", "Lcom/example/repogit/ui/repo/RepoListViewModel;", "hideError", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showError", "errorMessage", "", "app_debug"})
public final class RepoListActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.repogit.databinding.ActivityRepoListBinding binding;
    private com.example.repogit.ui.repo.RepoListViewModel viewModel;
    private com.google.android.material.snackbar.Snackbar errorSnackbar;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showError(@androidx.annotation.StringRes()
    int errorMessage) {
    }
    
    private final void hideError() {
    }
    
    public RepoListActivity() {
        super();
    }
}
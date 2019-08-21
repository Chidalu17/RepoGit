package com.example.repogit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.repogit.ui.repo.RepoListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRepoListBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView repoList;

  @Bindable
  protected RepoListViewModel mViewModel;

  protected ActivityRepoListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView repoList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.repoList = repoList;
  }

  public abstract void setViewModel(@Nullable RepoListViewModel viewModel);

  @Nullable
  public RepoListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityRepoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_repo_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRepoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRepoListBinding>inflateInternal(inflater, com.example.repogit.R.layout.activity_repo_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRepoListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_repo_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRepoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRepoListBinding>inflateInternal(inflater, com.example.repogit.R.layout.activity_repo_list, null, false, component);
  }

  public static ActivityRepoListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityRepoListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRepoListBinding)bind(component, view, com.example.repogit.R.layout.activity_repo_list);
  }
}

package com.example.repogit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.repogit.ui.repo.RepoViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemListBinding extends ViewDataBinding {
  @NonNull
  public final TextView repoDescriptionItem;

  @NonNull
  public final TextView repoNameItem;

  @Bindable
  protected RepoViewModel mViewModel;

  protected ItemListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView repoDescriptionItem, TextView repoNameItem) {
    super(_bindingComponent, _root, _localFieldCount);
    this.repoDescriptionItem = repoDescriptionItem;
    this.repoNameItem = repoNameItem;
  }

  public abstract void setViewModel(@Nullable RepoViewModel viewModel);

  @Nullable
  public RepoViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemListBinding>inflateInternal(inflater, com.example.repogit.R.layout.item_list, root, attachToRoot, component);
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemListBinding>inflateInternal(inflater, com.example.repogit.R.layout.item_list, null, false, component);
  }

  public static ItemListBinding bind(@NonNull View view) {
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
  public static ItemListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemListBinding)bind(component, view, com.example.repogit.R.layout.item_list);
  }
}

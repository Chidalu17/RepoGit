package com.example.repogit.ui.repo;

import com.example.repogit.Network.RepoApi;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepoListViewModel_MembersInjector implements MembersInjector<RepoListViewModel> {
  private final Provider<RepoApi> repoApiProvider;

  public RepoListViewModel_MembersInjector(Provider<RepoApi> repoApiProvider) {
    this.repoApiProvider = repoApiProvider;
  }

  public static MembersInjector<RepoListViewModel> create(Provider<RepoApi> repoApiProvider) {
    return new RepoListViewModel_MembersInjector(repoApiProvider);}

  @Override
  public void injectMembers(RepoListViewModel instance) {
    injectRepoApi(instance, repoApiProvider.get());
  }

  public static void injectRepoApi(RepoListViewModel instance, RepoApi repoApi) {
    instance.repoApi = repoApi;
  }
}

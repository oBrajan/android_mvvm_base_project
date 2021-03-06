package com.codextribe.mvvmbrajan.di.main;

import com.codextribe.mvvmbrajan.di.ViewModelKey;
import com.codextribe.mvvmbrajan.ui.main.posts.PostsViewModel;
import com.codextribe.mvvmbrajan.ui.main.profile.ProfileViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}


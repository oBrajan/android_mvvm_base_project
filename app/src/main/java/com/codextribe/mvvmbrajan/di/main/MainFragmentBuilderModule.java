package com.codextribe.mvvmbrajan.di.main;

import com.codextribe.mvvmbrajan.ui.main.posts.PostsFragment;
import com.codextribe.mvvmbrajan.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuilderModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}

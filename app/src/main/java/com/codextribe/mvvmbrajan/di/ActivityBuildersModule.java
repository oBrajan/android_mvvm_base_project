package com.codextribe.mvvmbrajan.di;

import com.codextribe.mvvmbrajan.di.auth.AuthModule;
import com.codextribe.mvvmbrajan.di.auth.AuthScope;
import com.codextribe.mvvmbrajan.di.auth.AuthViewModelsModule;
import com.codextribe.mvvmbrajan.di.main.MainFragmentBuilderModule;
import com.codextribe.mvvmbrajan.di.main.MainModule;
import com.codextribe.mvvmbrajan.di.main.MainScope;
import com.codextribe.mvvmbrajan.di.main.MainViewModelsModule;
import com.codextribe.mvvmbrajan.ui.auth.AuthActivity;
import com.codextribe.mvvmbrajan.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuilderModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainAcitivity();
}

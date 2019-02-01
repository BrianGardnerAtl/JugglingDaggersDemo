package com.bignerdranch.android.keepyourdaggersharp.inject

import com.bignerdranch.android.keepyourdaggersharp.NerdListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class InjectorModule {

    @ContributesAndroidInjector
    abstract fun contributeNerdListActivityInjector(): NerdListActivity
}
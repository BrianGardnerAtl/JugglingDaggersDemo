package com.bignerdranch.android.keepyourdaggersharp

import com.bignerdranch.android.keepyourdaggersharp.inject.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

open class NerdApplication : DaggerApplication() {

    lateinit var injector: AndroidInjector<NerdApplication>

    override fun onCreate() {
        injector = DaggerAppComponent.builder().create(this)
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return injector
    }
}
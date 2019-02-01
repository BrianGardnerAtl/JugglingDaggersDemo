package com.bignerdranch.android.keepyourdaggersharp

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class TestNerdApplication : NerdApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerTestComponent.builder()
                .create(this)
    }
}
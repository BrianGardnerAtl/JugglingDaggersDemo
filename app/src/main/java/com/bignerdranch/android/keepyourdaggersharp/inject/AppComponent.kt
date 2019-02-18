package com.bignerdranch.android.keepyourdaggersharp.inject

import com.bignerdranch.android.keepyourdaggersharp.NerdApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    InjectorModule::class,
    AppModule::class
])
interface AppComponent : AndroidInjector<NerdApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<NerdApplication>()
}
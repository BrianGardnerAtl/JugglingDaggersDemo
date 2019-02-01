package com.bignerdranch.android.keepyourdaggersharp

import com.bignerdranch.android.keepyourdaggersharp.inject.InjectorModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    InjectorModule::class,
    FakeAppModule::class // Module that returns fake authentication
])
interface TestComponent : AndroidInjector<NerdApplication> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<NerdApplication>()
}
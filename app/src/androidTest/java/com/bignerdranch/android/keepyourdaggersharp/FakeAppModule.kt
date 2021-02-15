package com.bignerdranch.android.keepyourdaggersharp

import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import com.bignerdranch.android.keepyourdaggersharp.model.OtherNerdStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FakeAppModule {
    @Provides
    @Singleton
    fun provideNerdStore(): NerdStore {
        return OtherNerdStore(listOf())
    }
}
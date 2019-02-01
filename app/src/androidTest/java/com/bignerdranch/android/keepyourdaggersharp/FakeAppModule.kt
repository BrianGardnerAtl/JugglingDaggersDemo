package com.bignerdranch.android.keepyourdaggersharp

import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import com.bignerdranch.android.keepyourdaggersharp.model.OtherNerdStore
import dagger.Module
import dagger.Provides

@Module
class FakeAppModule {
    @Provides
    fun provideNerdStore(): NerdStore {
        return OtherNerdStore(listOf())
    }
}
package com.bignerdranch.android.keepyourdaggersharp.inject

import com.bignerdranch.android.keepyourdaggersharp.model.LiveNerdStore
import com.bignerdranch.android.keepyourdaggersharp.model.Nerd
import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideNerdStore(nerds: List<Nerd>): NerdStore {
        return LiveNerdStore(nerds)
    }

    // Implementation-detail provides functions below

    @Provides
    fun provideNerds(): List<Nerd> {
        return listOf(
                Nerd("Brian"),
                Nerd("Kristin"),
                Nerd("Chris")
        )
    }
}
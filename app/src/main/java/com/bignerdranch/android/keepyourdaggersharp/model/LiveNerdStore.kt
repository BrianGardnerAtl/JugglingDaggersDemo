package com.bignerdranch.android.keepyourdaggersharp.model


class LiveNerdStore(private var nerdList: List<Nerd>): NerdStore {
    override fun getNerds(): List<Nerd> {
        return nerdList
    }
}
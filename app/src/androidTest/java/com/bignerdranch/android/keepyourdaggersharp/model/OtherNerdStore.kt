package com.bignerdranch.android.keepyourdaggersharp.model

class OtherNerdStore(var nerdList: List<Nerd>)
    : NerdStore {

    override fun getNerds(): List<Nerd> {
        return nerdList
    }
}
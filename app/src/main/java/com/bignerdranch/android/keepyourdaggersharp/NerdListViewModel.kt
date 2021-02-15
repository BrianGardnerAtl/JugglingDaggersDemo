package com.bignerdranch.android.keepyourdaggersharp

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NerdListViewModel : ViewModel() {

    @Inject
    lateinit var nerdStore: NerdStore

}
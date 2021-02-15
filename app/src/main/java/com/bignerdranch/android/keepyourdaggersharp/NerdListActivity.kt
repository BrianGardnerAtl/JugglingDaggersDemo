package com.bignerdranch.android.keepyourdaggersharp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NerdListActivity : AppCompatActivity() {

    @Inject
    lateinit var nerdStore: NerdStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nerd_list)
        for(nerd in nerdStore.nerds) {
            Log.d("NerdListActivity", "Have nerd $nerd")
        }
    }
}

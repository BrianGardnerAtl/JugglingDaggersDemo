package com.bignerdranch.android.keepyourdaggersharp

import android.support.test.runner.AndroidJUnit4
import com.bignerdranch.android.keepyourdaggersharp.model.OtherNerdStore
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NerdListActivityTest {

    @get:Rule
    val activityTestRule = InjectionActivityTestRule(
            NerdListActivity::class.java,
            DaggerTestComponent.builder()
    )

    @Test
    fun itInjectsTheCorrectNerdStoreImplementation() {
        val activity = activityTestRule.activity
        val nerdStore = activity.nerdStore
        assertThat(nerdStore, instanceOf(OtherNerdStore::class.java))
    }

    @Test
    fun itInjectsTheCorrectNerdStoreImplementation2() {
        val activity = activityTestRule.activity
        val nerdStore = activity.nerdStore
        assertThat(nerdStore, instanceOf(OtherNerdStore::class.java))
    }
}
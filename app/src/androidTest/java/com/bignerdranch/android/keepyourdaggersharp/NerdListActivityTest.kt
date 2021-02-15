package com.bignerdranch.android.keepyourdaggersharp

import android.widget.Button
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.rule.ActivityTestRule
import com.bignerdranch.android.keepyourdaggersharp.inject.AppModule
import com.bignerdranch.android.keepyourdaggersharp.model.NerdStore
import com.bignerdranch.android.keepyourdaggersharp.model.OtherNerdStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Singleton

@UninstallModules(AppModule::class)
@HiltAndroidTest
class NerdListActivityTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    val activityRule = ActivityScenarioRule(
            NerdListActivity::class.java
    )

    @Test
    fun itInjectsTheCorrectNerdStoreImplementation() {
        activityRule.scenario.onActivity { activity ->
            val nerdStore = activity.nerdStore
            assertThat(nerdStore, instanceOf(OtherNerdStore::class.java))
            val button = activity.findViewById<Button>(R.id.crime_button)
            // click on the button
            // verify that view state is correct
            activity.findViewById<Button>(R.id.modal_title)
        }
    }
}
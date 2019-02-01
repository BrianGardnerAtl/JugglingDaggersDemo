package com.bignerdranch.android.keepyourdaggersharp

import android.app.Activity
import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import dagger.android.AndroidInjector

class InjectionActivityTestRule<T : Activity>(
        activityClass: Class<T>,
        private val componentBuilder: AndroidInjector.Builder<NerdApplication>
) : ActivityTestRule<T>(activityClass) {

    override fun beforeActivityLaunched() {
        super.beforeActivityLaunched()
        // setup test component before activity launches
        val app = InstrumentationRegistry.getTargetContext().applicationContext as NerdApplication
        val testComponent = componentBuilder.create(app)
        app.setApplicationInjector(testComponent)
    }
}

private fun NerdApplication.setApplicationInjector(injector: AndroidInjector<NerdApplication>) {
    this.injector = injector.also {
        it.inject(this)
    }
}
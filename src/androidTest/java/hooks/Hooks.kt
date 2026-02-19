package com.dsg.app.hooks

import androidx.test.espresso.IdlingRegistry
import io.cucumber.java.Before
import io.cucumber.java.After

class Hooks {

    @Before
    fun registerIdlingResources() {
        // TODO: Register Espresso idling resources if any
        // IdlingRegistry.getInstance().register(...)
    }

    @After
    fun unregisterIdlingResources() {
        // TODO: Unregister Espresso idling resources if any
        // IdlingRegistry.getInstance().unregister(...)
    }
}
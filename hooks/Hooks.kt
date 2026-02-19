package com.dsg.app.hooks

import com.dsg.app.utils.WaitUtils
import io.cucumber.java.Before
import io.cucumber.java.After

class Hooks {
    @Before
    fun setUp() {
        WaitUtils.register()
        // TODO: Additional setup
    }
    @After
    fun tearDown() {
        WaitUtils.unregister()
        // TODO: Additional teardown
    }
}
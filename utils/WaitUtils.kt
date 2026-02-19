package com.dsg.app.utils

import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.idling.CountingIdlingResource

object WaitUtils {
    val idlingResource = CountingIdlingResource("GLOBAL")
    fun increment() = idlingResource.increment()
    fun decrement() = idlingResource.decrement()
    fun register() = IdlingRegistry.getInstance().register(idlingResource)
    fun unregister() = IdlingRegistry.getInstance().unregister(idlingResource)
}
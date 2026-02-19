package com.dsg.app.runner

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import io.cucumber.android.runner.CucumberAndroidJUnitRunner

class TestRunner : CucumberAndroidJUnitRunner() {
    override fun onCreate(arguments: Bundle?) {
        // Secure credential handling with defaults
        val username = arguments?.getString("username") ?: "defaultUser"
        val password = arguments?.getString("password") ?: "defaultPass"
        // Pass credentials to test context if needed
        super.onCreate(arguments)
    }
}
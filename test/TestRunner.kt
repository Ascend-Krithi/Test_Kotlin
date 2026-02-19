package com.dsg.app.test

import io.cucumber.junit.CucumberOptions
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["features"],
    glue = ["com.dsg.app.steps", "com.dsg.app.hooks"],
    plugin = ["pretty", "html:reports/cucumber-report.html", "junit:reports/cucumber.xml"],
    tags = ""
)
class TestRunner
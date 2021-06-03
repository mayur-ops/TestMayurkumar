package com.TestMayurkumar;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/Resources",tags = "@myAccount",
        plugin = {"html: target/cucumber-html-report", "json: target/cucumber-json-report.json",
                "junit: target/cucumber-xml-report.xml", "pretty: target/cucumber-pretty-report.txt"})
public class RunCukeTest {
}

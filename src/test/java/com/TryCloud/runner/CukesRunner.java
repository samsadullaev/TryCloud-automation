package com.TryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

    features ="src/test/resources/features",
        glue = "com/TryCloud/step_definitions",
        dryRun = false, //gives snippets when true
        tags = "@wip"
)

//instantiate-creating object
//every interface has default abstract method
//final you have to give a value
//static you dont have to give value
public class CukesRunner {
}

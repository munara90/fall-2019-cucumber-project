package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //@RunWith is JUnit,  to run the the Cucumber
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/cybertek/library/step_definitions",
        dryRun = false, //--> should be false ro print
        tags = "@wip"
         // tags="@smoke"
         // tags="@librarian"
         // tags="@librarian @staff"
         // tags="@librarian or @student "--> at least one Scenario should match
         // tags="@login and @staff", //--> both Scenario both should match to run
         // tags="not @staff" //--> dont run/exclude Scenario that has tag @staff
         // tags="@admin and not @staff" //--> run all @admin, but not @staff

)

public class CukesRunner {}

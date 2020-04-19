package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.util.concurrent.TimeUnit;

public class Hooks { //make sure it is in step definitions class

    @Before(order = 0)   //--> choose from cucumber, not JUnit; order = 0--> prioritizes
    public void setUpScenario(){
        System.out.println("Set up browser");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Driver.getDriver().manage().window().maximize();

    }
    @Before("@db") //only runs Scenario w @db --> data base, I can do "not @db"--> runs e/v except "@db"
    public void connect(){
        System.out.println("connecting to db");
    }

    @After("@db")
    public void tearDownScenario(){
        System.out.println("closing db");
        Driver.closeDriver();
    }
   // @BeforeStep //--> runs after each Scenario
    public void setUptStep(){ //for each line of code
        System.out.println("prints before every step"); //can be used for Screen Shot
    }
   // @AfterStep //--> runs after each Scenario
    public void step(){
        System.out.println("prints after every step"); //can be used for Screen Shot
    }



}

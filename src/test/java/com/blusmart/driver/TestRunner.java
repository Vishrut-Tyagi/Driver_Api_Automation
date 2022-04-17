package com.blusmart.driver;

import com.blusmart.driver.Database.BlusmartDevDb;
import com.blusmart.driver.steps.Api_test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "classpath:features",
        glue = {"com.blusmart.driver.steps"},
//        tags = {"@LoginTest1,@ChargingTest1"},
        plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt"}
)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() throws Exception{
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }


    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {

        testNGCucumberRunner.finish();
    }
}
package com.automation.hooks;

import com.automation.base.BaseSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseSetup {

    @Before
    public void beforeScenario() {
        setUp();
        setUpPageObjects();
    }

    @After
    public void afterScenario() {
        tearDown();
    }
}

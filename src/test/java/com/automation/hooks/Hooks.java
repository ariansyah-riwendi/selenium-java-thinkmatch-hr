package com.automation.hooks;

import com.automation.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

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

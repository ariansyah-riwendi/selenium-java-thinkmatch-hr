package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private final Utils utils;

    private final By logoImage = By.xpath("//*[@id='root']/div/aside/div[1]/a/img");

    public DashboardPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickLogoImage() {
        utils.click(logoImage);
    }

}


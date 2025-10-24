package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuperPortalUserPage {

    private final Utils utils;

    private final By superPortalUserSideBar = By.xpath("//*[@id='aiApp']/a[1]/div/div");
    private final By allSuperPortalUserTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public SuperPortalUserPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickSuperPortalUserUserSideBar() {
        utils.click(superPortalUserSideBar);
    }

    public boolean allSuperPortalUserTableIsDisplayed() {
        return utils.isElementDisplayed(allSuperPortalUserTable);
    }

}


package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListUserPage {

    private final Utils utils;

    private final By listUserSideBar = By.xpath("//*[@id='aiUUseryPage']/a[1]/div/div");
    private final By allUserFromCompanyTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public ListUserPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickListUserSideBar() {
        utils.click(listUserSideBar);
    }

    public boolean allUserFromCompanyTableIsDisplayed() {
        return utils.isElementDisplayed(allUserFromCompanyTable);
    }

}


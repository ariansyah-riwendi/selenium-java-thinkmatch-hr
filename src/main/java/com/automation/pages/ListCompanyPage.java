package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListCompanyPage {

    private final Utils utils;

    private final By companySideBar = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/div/div/div[1]");
    private final By listCompanySideBar = By.xpath("//*[@id='aiCompanyPage']/a[1]/div/div");
    private final By allCompanyTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public ListCompanyPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickCompanySideBar() {
        utils.click(companySideBar);
    }

    public void clickListCompanySideBar() {
        utils.click(listCompanySideBar);
    }

    public boolean allCompanyTableIsDisplayed() {
        return utils.isElementDisplayed(allCompanyTable);
    }

}


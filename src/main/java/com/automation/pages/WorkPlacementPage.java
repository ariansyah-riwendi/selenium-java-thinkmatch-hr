package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkPlacementPage {

    private final Utils utils;

    private final By employee = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/div/div/div[1]");
    private final By workPlacement = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/ul/li[2]/a[1]/div/div");
    private final By workPlacementListTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public WorkPlacementPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickEmployee() {
        utils.click(employee);
    }

    public void clickWorkPlacement() {
        utils.click(workPlacement);
    }

    public boolean workPlacementListTableIsDisplayed() {
        return utils.isElementDisplayed(workPlacementListTable);
    }
}


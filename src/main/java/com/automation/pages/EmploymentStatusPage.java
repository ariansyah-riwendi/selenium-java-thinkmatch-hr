package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmploymentStatusPage {

    private final Utils utils;

    private final By employmentStatus = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/ul/li[3]/a[1]/div/div");
    private final By employmentStatusTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public EmploymentStatusPage(WebDriver driver) {
        this.utils = new Utils(driver);
    }


    public void clickEmploymentStatus() {
        utils.click(employmentStatus);
    }

    public boolean employmentStatusTableIsDisplayed() {
        return utils.isElementDisplayed(employmentStatusTable);
    }
}


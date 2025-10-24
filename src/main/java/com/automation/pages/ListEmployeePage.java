package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListEmployeePage {

    private final Utils utils;

    private final By listEmployee = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/ul/li[1]/a[1]/div/div");
    private final By allEmployeeTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div[1]/div");

    public ListEmployeePage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickListEmployee() {
        utils.click(listEmployee);
    }

    public boolean allEmployeeTableIsDisplayed() {
        return utils.isElementDisplayed(allEmployeeTable);
    }
}


package com.automation.pages;

import com.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyStructurePage {

    private final Utils utils;

    private final By companyStructure = By.xpath("//*[@id='root']/div/aside/div[2]/nav/ul/li[3]/ul/li[4]/a[1]/div/div");
    private final By companyOrganizationalStructureTable = By.xpath("//*[@id='root']/div/section/main/div[2]/div/div[1]/div/div");

    public CompanyStructurePage(WebDriver driver) {
        this.utils = new Utils(driver);
    }

    public void clickCompanyStructure() {
        utils.click(companyStructure);
    }

    public boolean companyOrganizationalStructureTableIsDisplayed() {
        return utils.isElementDisplayed(companyOrganizationalStructureTable);
    }
}


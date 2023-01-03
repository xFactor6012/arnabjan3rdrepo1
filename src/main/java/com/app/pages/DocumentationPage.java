package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentationPage {
    private WebDriver driver;
    public DocumentationPage(WebDriver driver){
        this.driver = driver;
    }
    public void launchDocumentation(){
        String expectedPageTitle = "The Selenium Browser Automation Project | Selenium";
        driver.findElement(By.linkText("Documentation")).click();
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Documentation page not loaded");
    }
    public void verifyDocumentationHeader(){
        String expectedHeader = "Documentation";
        String actualHeader = driver.findElement(By.xpath("//span[@class=\"td-sidebar-nav-active-item\"]")).getText();
        Assert.assertEquals(expectedHeader,actualHeader, "Documentation header is not correct");
    }
}

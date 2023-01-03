package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadsPage {
    private static WebDriver driver;
    public DownloadsPage(WebDriver driver){
        this.driver = driver;
    }
    public void launchDownloads(){
        String expectedPageTitle = "Downloads | Selenium";
        driver.findElement(By.linkText("Downloads")).click();
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Downloads page not loaded");
    }

    public void verifyDownloadHeader(){
        String expectedHeader = "Downloads";
        String actualHeader = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedHeader,actualHeader, "Download header is not correct");
    }
}

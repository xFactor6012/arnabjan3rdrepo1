package com.app.tests;

import com.app.pages.DocumentationPage;
import com.app.pages.DownloadsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
    WebDriver driver;
    DownloadsPage downloadsPage;
    DocumentationPage documentationPage;

    @BeforeMethod
    public void setup() throws InterruptedException {
        String rootFolder = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", rootFolder+"//src//test//resources//chromedriver.exe");
        driver = new ChromeDriver();
        downloadsPage = new DownloadsPage(driver);
        documentationPage = new DocumentationPage(driver);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("Completed");
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void verifyDownloadsPage(){
        downloadsPage.launchDownloads();
        downloadsPage.verifyDownloadHeader();
    }

    @Test
    public void verifyDocumentationPage(){
        documentationPage.launchDocumentation();
        documentationPage.verifyDocumentationHeader();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

package com.ex.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class GurockCompanyLInks extends BaseTest {
    String homeUrl = "https://www.gurock.com/testrail/";

    @Test
    public void aboutLink() {
        String expectedAboutUrl = homeUrl + "about/";
        webDriver.get(homeUrl);
        WebElement webElement = findElement(webDriver, By.xpath("//a[@href='/testrail/about']"));

        scrollToElement(webDriver, webElement);
        webElement.click();

        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedAboutUrl);
    }

    @Test
    public void jobsLink() {
        String expectedJobsUrl = homeUrl + "about/jobs/";

        webDriver.get(homeUrl);
        WebElement webElement = findElement(webDriver, By.xpath("//a[@href='/testrail/about/jobs']"));
        scrollToElement(webDriver, webElement);
        webElement.click();

        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedJobsUrl);

    }

    @Test
    public void contactLink() {
        String expectedContactUrl = homeUrl + "about/contact/";
        webDriver.get(homeUrl);
        WebElement webElement = findElement(webDriver, By.xpath("//a[@href='/testrail/about/contact']"));
        scrollToElement(webDriver, webElement);
        webElement.click();

        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedContactUrl);
    }

    @Test
    public void complianceLink() {
        String expectedComplianceUrl = homeUrl + "soc-2-compliance-certification/";
        webDriver.get(homeUrl);
        WebElement webElement = findElement(webDriver, By.xpath("//a[contains(text(),'Compliance')]"));
        scrollToElement(webDriver, webElement);
        webElement.click();

        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedComplianceUrl);
    }

    @Test
    public void legalLink() {
        String expectedLegalUrl = "https://www.ideracorp.com/legal/Gurock";
        webDriver.get(homeUrl);
        WebElement webElement = findElement(webDriver, By.xpath("//a[contains(text(),'Legal')]"));

        scrollToElement(webDriver, webElement);
        webElement.click();

        ArrayList<String> tabs = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));

        String actualUrl = webDriver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedLegalUrl);

        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        webDriver.manage().window().maximize();

        WebElement subscribeBtn = waitElementClickable(webDriver, By.xpath("//div[@class='col-6 col-sm-6 col-md-4 col-lg-3 gk-footer-menu-item-first']/a"));
        scrollToElement(webDriver, subscribeBtn);
        subscribeBtn.click();



    }
}

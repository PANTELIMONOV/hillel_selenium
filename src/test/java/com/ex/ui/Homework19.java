package com.ex.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class Homework19 extends BaseTest {
    String url1 = "https://theautomationzone.blogspot.com/";
    String url2 = "http://automationpractice.com/";

    @Test
    public void uploadFile() {
        webDriver.get(url1);
        webDriver.findElement(By.xpath("//input[@id='photo']")).sendKeys("/home/mpantelimonov/IdeaProjects/" +
                "hillel_selenium/src/test/java/com/ex/data/file.txt");
        String text = webDriver.findElement(By.xpath("//input[@id='photo']")).getText();
    }

    @Test
    public void randomCheckbox() {
        webDriver.get(url1);
        List<WebElement> divs = webDriver.findElements(By.xpath("//div[@class='divTableBody']//input"));
        Random random = new Random();
        divs.get(random.nextInt(divs.size())).click();
    }

    @Test
    public void randomTab() {
        webDriver.get(url2);
        List<WebElement> tabs = webDriver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content " +
                "sf-js-enabled sf-arrows']/li"));
        Random random = new Random();
        tabs.get(random.nextInt(tabs.size())).click();
    }
}

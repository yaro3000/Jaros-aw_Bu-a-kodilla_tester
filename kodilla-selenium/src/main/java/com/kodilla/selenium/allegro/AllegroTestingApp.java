package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        while (!driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
        }
        driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();

        WebElement setCombo = driver.findElement(By.xpath("//*[@class=\"_r65gb _1fwkl\"]/select"));
        Select selectElectronic = new Select(setCombo);
        selectElectronic.selectByIndex(3);

        WebElement setTextField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        setTextField.sendKeys("Mavic mini");
    }
}

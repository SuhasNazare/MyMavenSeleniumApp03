package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws InterruptedException {
        
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--headless=new"); 
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/products");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("[data-product-id='4']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        driver.findElement(By.cssSelector("[data-product-id='5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        driver.findElement(By.cssSelector("[data-product-id='6']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-success.close-modal.btn-block")).click();

        driver.get("https://automationexercise.com/view_cart");

        driver.navigate().refresh();

        Thread.sleep(10000);

        driver.quit();
    }
}

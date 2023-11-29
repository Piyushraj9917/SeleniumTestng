package org.example;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("de");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'IXA')]")).click();


        driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
        Thread.sleep(3000);
        //Selecting the dates
        driver.findElement(By.cssSelector("div[class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[5]/div[2]")).click();

        // driver.findElement(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).click();

        //  Thread.sleep(3000);
      //  System.out.println(indexes);
/*
        for(WebElement index:indexes)
        {
            if(index.getText().equalsIgnoreCase("Delhi"))
            {
                index.click();

            }
            System.out.println("These are the cities : "+index.getText());

        }
        Thread.sleep(3000);

 */
       // driver.close();

    }
}
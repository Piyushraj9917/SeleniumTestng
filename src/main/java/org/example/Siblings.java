package org.example;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Siblings {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@href,'practice-project')]")).click();
        driver.findElement(By.id("name")).sendKeys("Piyush Raj");
        driver.findElement(By.id("email")).sendKeys("rajpiyu4101997@gmail.com");
        driver.findElement(By.id("form-submit")).click();
       // driver.findElement(By.className("theme-btn register-btn")).click();
       // WebDriverWait w = new WebDriverWait(driver, 10);
     //   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'practice-project')]")));

        driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/AutomationPractice/']")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

    }
}

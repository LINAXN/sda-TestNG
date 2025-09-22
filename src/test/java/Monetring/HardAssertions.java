package Monetring;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class HardAssertions extends TestBase {
//    Task 4: Hard Assertions Practice
//    Objective: Implement hard assertions for login functionality
//    Test Case: Positive Login Test
// 1. Navigate to
//    https://claruswaysda.github.io/signIn.html
//            2. Enter username: "admin"
//            3. Enter password: "123"
//            4. Click Submit button
// 5. Use hard assertions to verify:
//    New page URL is "
//    https://claruswaysda.github.io/signIn.html"
//    Page contains text "Employee Table

    @Test
    void test() {
        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Hard assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://claruswaysda.github.io/signIn.html", "URL does not match expected value.");
        Assert.assertTrue(driver.getPageSource().contains("Employee Table"), "Page does not contain expected text 'Employee Table'.");

    }
}

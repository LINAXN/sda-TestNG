package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertions  {
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
protected WebDriver driver;
@BeforeClass
void beforeClass(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
    @Test
    void test() {
        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Hard assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://claruswaysda.github.io/signIn.html", "URL does not match expected value.");
        Assert.assertTrue(driver.getPageSource().contains("Employee Table"), "Page does not contain expected text 'Employee Table'.");

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }}



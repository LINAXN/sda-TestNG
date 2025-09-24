package Monetring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class C03_DependencyTest {
//     1. Create a class called
//DependencyTest
// 2. Create a
//    @BeforeClass method to set up WebDriver
// 3. Create the following dependent test chain:
//    openYahoo() - Navigate to Yahoo
//    openBing() - Navigate to Bing (depends on Yahoo test)
//    openDuckDuckGo() - Navigate to DuckDuckGo (depends on Bing test)
// 4. Add intentional failure in Yahoo test and observe behavior
// 5. Create
//    @AfterClass method to close driver
protected WebDriver driver;
    @BeforeClass
    void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
     void openYahoo() {
        driver.get("https://www.yahoo.com");
      Assert.assertTrue(false, "Intentional failure ");

    }

    @Test(dependsOnMethods = {"openYahoo"})
     void openBing() {
        driver.get("https://www.bing.com");
    }

    @Test(dependsOnMethods = {"openBing"})
     void openDuckDuckGo() {

        driver.get("https://www.duckduckgo.com");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
}}

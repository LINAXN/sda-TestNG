package Monetring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.TestBase;

import java.time.Duration;

public class C07_Parameterizing {
    protected WebDriver driver;
    @BeforeClass
    void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    @Parameters({"todo"})
    void paramsTest(@Optional("Study Selenium") String todo) {

        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        driver.findElement(By.tagName("input")).sendKeys(todo, Keys.ENTER);
        String lastToDo = driver.findElements(By.tagName("li")).getLast().getText();
        Assert.assertEquals(lastToDo, todo);

    }
        @AfterClass
        public void tearDown() {
            driver.quit();
        }}


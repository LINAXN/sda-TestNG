package Monetring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C12_DataProviderTask extends TestBase {
    /*
    Go to https://claruswaysda.github.io/Registration.html
    Fill the form
    Do it with all 3 ways
    (Same class Data Provider, Data Provider with Faker, Data Provider with Excel)
    */
    @DataProvider(name = "UserRegistration")
    public Object[][] UserRegistration() {
        return new Object[][]{
                {"123-24-2341", "Lina", "Alhumaidi", "linaxn", "lina@gmail.com", "Ufdv1234"},
        };
    }


    @Test(dataProvider = "UserRegistration")
    void dataProviderTaskTest(String ssn, String firstName, String lastName, String username, String email, String password) {

        driver.get("https://claruswaysda.github.io/Registration.html");

        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.cssSelector("label[for='female']")).click();
        new Select(driver.findElement(By.id("job"))).selectByVisibleText("Developer");


        String filePath = "C:\\Users\\PCD\\IdeaProjects\\TestNG\\lina.pdf";
        ;
        File file = new File(filePath);
        if (file.exists()) {
            driver.findElement(By.id("cv")).sendKeys(filePath);
        } else {
            System.out.println("File not found: " + filePath);
        }


        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);


        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("No alert appeared.");
        }
    }


    @Test(dataProvider = "faker2", dataProviderClass = utilities.DataProviderUtilities.class)
    void dataProviderTaskTest02(String ssn, String firstname, String lastname ,String username, String email, String password ) {
//        Go to https://claruswaysda.github.io/Registration.html
        driver.get("https://claruswaysda.github.io/Registration.html");
//        Fill the form
        driver.findElement(By.id("ssn")).sendKeys(ssn);
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);

        driver.findElement(By.cssSelector("label[for='female']")).click();
        new Select(driver.findElement(By.id("job"))).selectByVisibleText("Developer");


        String filePath = "C:\\Users\\PCD\\IdeaProjects\\TestNG\\lina.pdf";
        ;
        File file = new File(filePath);
        if (file.exists()) {
            driver.findElement(By.id("cv")).sendKeys(filePath);
        } else {
            System.out.println("File not found: " + filePath);
        }


        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);


        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("No alert appeared.");
        }
    }

}
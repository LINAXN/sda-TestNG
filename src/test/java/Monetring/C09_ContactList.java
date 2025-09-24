package Monetring;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C09_ContactList extends TestBase {

    /*
        Go to https://thinking-tester-contact-list.herokuapp.com/
        Enter email as "johndoeSDA@yahoo.com" using parameter
        Enter password as "John.123" using parameter
        Create a contact using parameter(Only firstname and lastname)
        Assert the added contact.
        Make the group name "CL" for method and run it via group.
     */

    @Test(groups = "CL")
    @Parameters({"email", "password", "firstName", "lastName"})
    void contactListTest(String email , String password ,String firstName, String lastName){
driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);

        driver.findElement(By.id("add-contact")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement addedContact = driver.findElement(By.xpath("//td[text()='" + firstName + " " + lastName + "']"));
        Assert.assertTrue(addedContact.isDisplayed(), "Contact was not added!");

    }

}

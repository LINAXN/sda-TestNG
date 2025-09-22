package Monetring;

import org.testng.annotations.*;

public class AnnotationHierarchyTest {
//     1. Create a TestNG class called
//AnnotationHierarchyTest
// 2. Implement all TestNG annotations (@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod,
//                                      @Test, @AfterMethod, @AfterClass, @AfterTest, @AfterSuite)
// 3. Add print statements in each method to observe execution order
// 4. Create 2 test methods
// 5. Run the test and analyze console output
//    Expected Output: Console should show the exact annotation execution sequence

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void test01() {
        System.out.println("Test01");
    }

    @Test
    public void test02() {
        System.out.println("Test02");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}


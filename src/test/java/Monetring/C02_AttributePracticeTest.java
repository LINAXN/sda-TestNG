package Monetring;

import org.testng.annotations.*;

public class C02_AttributePracticeTest {
//    1. Create a class called
//AttributePracticeTest
// 2. Create 5 test methods with different priorities (1, 3, 2, 5, 4)
// 3. Create one test method with
//            enabled = false
// 4. Create a test method with timeout of 3 seconds that includes
//Thread.sleep(2000)
//        5. Create a test method with timeout of 1 second that includes
//hread.sleep(2000) T(should fail)
//            6. Add meaningful descriptions to all test methods
// 7. Create test methods with groups: "smoke", "regression", "api"
@Test(priority = 1 ,description ="this is 1 test method" )
public void test01() {
    System.out.println("1");
}

    @Test(priority = 3,description ="this is 2 test method")
    public void test02() {
        System.out.println("2");
    }
    @Test(priority = 2,description ="this is 3 test method")
    public void test03() {
        System.out.println("3");
    }

    @Test(priority = 5 ,description ="this is 4 test method")
    public void test04() {
        System.out.println("4");
    }
    @Test(priority = 4 ,description ="this is 5 test method")
    public void test05() {
        System.out.println("5");
    }

    @Test(timeOut = 3000,description ="this is timeout test method should be passs")
    void timeoutTest01() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("timeout 1 tested");

    }
    @Test(timeOut = 1000,description ="this is timeout test method should be fail")
    void timeoutTest02() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("timeout 2 tested");

    }
    @Test(groups = {"smoke","regression"})
    void groupTest(){
        System.out.println("group tested");
    }
}



package FirstTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void t1 () {
        System.out.printf("Действие перед тестом");
    }

    @AfterTest
    public void t2 () {
        System.out.printf("Действие после теста");
    }

    @BeforeMethod
    public void t3 () {
        System.out.printf("Действие перед методом");
    }

    @AfterMethod
    public void t4 () {
        System.out.printf("Действие после метода");
    }
}

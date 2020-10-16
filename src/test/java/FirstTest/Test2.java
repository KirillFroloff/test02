package FirstTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {

    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }

    @Test(dataProvider = "SetEnvironment")
    public void t2(String id3, String id4) {
        System.out.println(id3);
        System.out.println(id4);


    }

}

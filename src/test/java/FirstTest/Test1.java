package FirstTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void t(String id1, String id2) {

        System.out.println(id1);
        System.out.println(id2);
    }
}


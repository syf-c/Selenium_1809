package Day10;

import Utiles.TestBforeClassAfterClass;
import org.junit.Test;

public class C02_İlkTestBaseClass extends TestBforeClassAfterClass {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }
}


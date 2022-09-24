package Day10;

import Utiles.TestBforeaAfter;
import org.bouncycastle.util.io.TeeInputStream;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C03_Actions extends TestBforeaAfter {

    @Test
        public void test1(){
        //amazon git
        driver.get("https://amazon.com");
        // accont menusunden create a list linkiine tıklayalım
        Actions action=new Actions(driver);
        WebElement accounLink=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
        action.moveToElement(accounLink).perform();



    }
}

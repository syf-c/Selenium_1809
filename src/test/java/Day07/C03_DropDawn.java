package Day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_DropDawn {
     /*
          ●https://www.amazon.com/ adresinegidin.
          -Test1
          Arama kutusunun yanindaki kategori menusundeki kategori sayisinin45
          oldugunu testedin
          -Test2
          1.Kategori menusunden Books seceneginisecin
          2.Arama kutusuna Java yazin vearatin
          3.Bulunan sonuc sayisiniyazdirin
          4.Sonucun Java kelimesini icerdigini testedin
*/

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }
    @Test
    public void test1(){
        //  Arama kutusunun yanindaki kategori menusundeki kategori sayisinin45
        //          oldugunu testedin
        WebElement ddm=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select =new Select(ddm);
        List<WebElement>ddmlist=select.getOptions();
        System.out.println(ddmlist.size());
        int expenssayı= 45;
        int guncelddm=ddmlist.size();
        Assert.assertNotEquals(expenssayı,guncelddm);
    }
}
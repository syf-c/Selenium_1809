package Day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assertion {
    /*
      - Amazon sayfasına gidelim
      3 farklı test methodu oluşturalım
        a-Url'nin amazon içerdiğini test edelim
        b-Title'in facebook içermediğini test edelim
        c- sol üst köşede amazon logosunun göründüğünü test edelim
       */
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @AfterClass
    public static void tearDown() {
        //driver.close();
    }

    @Test
    public void test1() {
       // a-Url'nin amazon içerdiğini test edelim
        String expectedUrl="amazon";
        String actuelUrl=driver.getCurrentUrl();
        Assert.assertTrue(actuelUrl.contains(expectedUrl)) ;
    }

    @Test
    public void test2() {
        // b-Title'in facebook içermediğini test edelim
        String actualtitle=driver.getTitle();
        String expectedtitle="facabook";
        Assert.assertFalse(actualtitle.contains(expectedtitle));

    }

    @Test
    public void test3() {
        //c- sol üst köşede amazon logosunun göründüğünü test edelim

        WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logo.isDisplayed());


    }
    public  void  test4(){
        // d-url nin faceboook.com olduğunu test edininiz

        String expectedUrl = "www.facebook.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(expectedUrl,actualUrl);

    }
}
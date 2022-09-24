package Day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C04_IFRAME {

    WebDriver driver;

    @Before
    public void satup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @After
    public void tearDown() {
        //driver.close();
    }

    @Test
    public void test1(){
driver.get("https://html.com/tags/iframe/");
        List<WebElement>iframelist =new ArrayList<>(driver.findElements(By.xpath("//iframe")));
        driver.switchTo().frame(iframelist.get(0));
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();



    }
}

package Day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

 /*
        Bir class olusturun: IframeTest
        ● https://the-internet.herokuapp.com/iframe adresine gidin.
        ● Bir metod olusturun: iframeTest
        ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        ○Text Box’a “Merhaba Dunya!” yazin.
        ○TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
        dogrulayin ve konsolda yazdirin.
     */


public class C01_Iframe {

    WebDriver driver;

    @Before
    public void satup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement ıfaremeyazdır=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(ıfaremeyazdır.isDisplayed());
        System.out.println(ıfaremeyazdır.getText());
        WebElement texbox=driver.findElement(By.id("mce_0_ifr"));
        Thread.sleep(200);
        driver.switchTo().frame(texbox);
        WebElement textBoxFrame = driver.findElement(By.xpath("//p"));
        textBoxFrame.clear(); // Clear methodu text box'ın içini temizler
        Thread.sleep(2000);
        textBoxFrame.sendKeys("Merhaba Dunya!");
        //       ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
        //         dogrulayin ve konsolda yazdirin
    }

    }


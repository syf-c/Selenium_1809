package Practice;

import Utiles.TestBforeaAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class amazon extends TestBforeaAfter{



    @Test
    public void test1() throws InterruptedException {
    //     1. Amazon sayfasını acalım
    driver.get("https://amazon.com.tr");
    //     2. sayfanın acıldıgını dogrulayalım
    String actuel=driver.getTitle();
    String expected="Amazon.com.tr";
    Assert.assertTrue(actuel.contains(expected));
    driver.findElement(By.name("accept")).click();

    //     3.header daki sigin butonuna basalım
     WebElement headeracconBatton=driver.findElement(By.cssSelector("[id=\"nav-link-accountList\"]"));
     Actions actions = new Actions(driver);
     actions.moveToElement(headeracconBatton);
     Thread.sleep(1000);
     WebElement girisButton = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
     actions.moveToElement(girisButton).click().perform();

    //     4. kullanıc adı ve şifre bilgisini girerek login olalım
//        WebElement emailkutusu=driver.findElement(By.xpath("//input[@id='ap_email']"));
//        actions.moveToElement(emailkutusu).sendKeys("syf0140@hotmail.com" + Keys.ENTER).perform();

        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("syf0140@hotmail.com" + Keys.ENTER);

        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("amazon123456"+Keys.ENTER);


    //     5. başarılı bir şekilde login oldugumuzu dogrulayalım.

    //     6. header da account butonu altında create a list butonuna basalım

    //     7. create a list sayfasının açıldıgını dogrulayalım

    //     8.sayfada bulunan create a list butonuna basalım

    //     9.açılan popup menuden oluşturacagımız listenin adını girelim ve create a list butonuna basalım

    //     10. listemin başarılı bir şekilde oluştugunu dogrulayalım

    //     11. kategori bölümünden computers seçilir

    //     12. kategori bolumnde computer seçili oldugunu dogrulayım

    //     13. arama kutusuna msi yazıp aratalım

    //     14. arama kutusunda msi arandığını dogrulayalım

    //     15. gelen ürün sayfasında 2. sayfaya gecelim

    //     16. 2. sayfadaki 2. urunu secelim

    //     17. acılan sayfada gelen urunun 2. urun oldugunu dogrulayalım
    //     18. urunu listemize ekleyelim

    //     19. listemizi açalım

    //     20. listemizdeki urunumuzu silelim

    //     21. listemizdeki urunumuzun silindigi dogrulayaım

    //     22. siteden logout olalım

    //     23. logout dogrulayalım.
}
}
package Day15;

import Utiles.TestBforeaAfter;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class C04_Get_ScreenShort extends TestBforeaAfter {
    @Test
    public void test1() throws IOException {
        //Amazon sayfasına gidelim tum sayfanın resmini alalim
        driver.get("https://bestbuy.com");
        /*
        Bir web sayfanın resmini alabilmek için TakesScreenshot class'ın obje oluşturup
        Geçici bir File class'ından değişkene TakesScreenShot'dan oluşturduğum obje'den getScreenShotAs
        methonu kullanarak geçici bir file oluştururuz
         */
        TakesScreenshot ts = (TakesScreenshot) driver;
        File tumSayfaResmi = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/AllPage"+tarih+".jpeg"));
    }

}

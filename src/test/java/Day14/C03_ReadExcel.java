package Day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {
    @Test
    public void readexceltest1() throws IOException {

// belirtilen satir no ve sutun no degerlerini parametre olarak alip
// o cell'deki datayi konsola yazdirin
// sonra sonucun konsolda yazanla ayni oldugunu dogrulayin
        int satır= 12;
        int sutun =2;
        String dosyayolu="src/reseorces/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyayolu);
        Workbook workbook = WorkbookFactory.create(fis);
        String actualData = workbook.
                getSheet("Sayfa1")
                .getRow(satır-1)
                .getCell(sutun-1)
                .toString();
        System.out.println(actualData);
        //Index 0'dan başladığı için bizden istenen satıra ulaşabilmek için bir eksiğini alırız

        String konsoldaYazan = "Baku";
        Assert.assertEquals(konsoldaYazan,actualData);



    }
}

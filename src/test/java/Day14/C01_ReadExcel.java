package Day14;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void ReadExcelTest1() throws IOException {

//- Dosya yolunu bir String degiskene atayalim
        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        String dosyayolu="src/reseorces/ulkeler.xlsx";
        //- Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        FileInputStream fis=new FileInputStream(dosyayolu);
        //- WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis);
        //- Sheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("sayfa1");
        //- Row objesi olusturun sheet.getRow(index)
        Row row =sheet.getRow(3);
        //- Cell objesi olusturun row.getCell(index)
        Cell cell=row.getCell(3);
        System.out.println(cell);
        //- 3. index'deki satirin 3. index'indeki datanin Cezayir oldugunu test edin
        String espectedData= "Cezayir";
        String ectualData=cell.toString();
        Assert.assertEquals(espectedData,ectualData);

    }
}

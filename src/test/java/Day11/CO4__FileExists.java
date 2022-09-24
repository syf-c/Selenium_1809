package Day11;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CO4__FileExists {
    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));//içinde bulunduğu yolu gösterir
        System.out.println(System.getProperty("user.home"));// gecerli kullanıcın ana dizinini verir
//"C:\Users\User\Desktop\text.txt"
        String farklıbölüm=System.getProperty("user.home"); //masa üstümdeki dosya yolu
        String ortakbölüm="\\User\\Desktop\\text.txt";
        String masaüstüdosyayolu=farklıbölüm+ortakbölüm; // masa üsütündeki dosyanın yolunu gösterir
        System.out.println(masaüstüdosyayolu);
    //Assert.assertTrue(Files.exists(Path.of(masaüstüdosyayolu)));



    }
}

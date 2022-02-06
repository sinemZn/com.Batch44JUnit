package seleniumHomework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class C05 {
    static WebDriver driver;
    static WebElement searchbox;


//            - Test 1
//    Arama kutusunun yanindaki kategori menusundeki kategori
//    sayisinin 45 oldugunu test edin
//-Test 2
//            1. Kategori menusunden Books secenegini secin
//2. Arama kutusuna Java yazin ve aratin
//3. Bulunan sonuc sayisini yazdirin
//4. Sonucun Java kelimesini icerdigini test edin

    @Test
      public void test1(){
        List<WebElement> kategoriSayisi=driver.findElements(By.tagName("option"));
        System.out.println("kategori sayisi: "+ kategoriSayisi.size());
    }


    @Test
      public void test2(){



    }



    @BeforeClass
    public static void ayarlariDuzenle() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
    }

    @AfterClass
    public static void ortaligitopla() {
        System.out.println("ortaligi topla calisti");
        //driver.close();
    }


}










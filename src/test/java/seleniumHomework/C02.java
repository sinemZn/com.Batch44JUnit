package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1-driver olusturalim
        //2-java class'imiza chromedriver.exe'yi tanitalim
        //3-driver'in tum ekrani kaplamasini saglayalim
        //4-https://github.com/ adresine gidelim
             driver.navigate().to("https://github.com/");
             driver.manage().window().maximize();
             Thread.sleep(2000);
        //5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
             driver.navigate().to("https://www.hepsiburada.com/");


        //6-Title ve url console da yazdirin ve yine title ve url in
        // "burada" kelimesini icerip icermedigini kontrol edelim
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String actualTitle= driver.getTitle();
        String actualUrl= driver.getCurrentUrl();
        String expected="burada";

        if (actualTitle.contains("burada")){
            System.out.println("title contains--burada-- ");
        }else{
            System.out.println("title no contain--burada--");
        }
        if (actualUrl.contains("burada")){
            System.out.println("url contains--burada--");
        }else{
            System.out.println("url no contain--burada--");
        }

        //7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
           Thread.sleep(2000);
          driver.navigate().back();
          driver.navigate().back();

        //8-Son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();
        driver.quit();



    }
}
/*  Hocanin cozumu:
     public static void main(String[] args) throws InterruptedException {
        // System.setProperty:driver i tanitir
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.get("https://www.hepsiburada.com/");
        String hbTitle= driver.getTitle();
        String hbUrl = driver.getCurrentUrl();
​
        System.out.println("hbUrl = " + hbUrl);
        System.out.println("hbTitle = " + hbTitle);
​
        if (hbTitle.contains("burada") || hbUrl.contains("burada")){
            System.out.println("burada kelimesi icerir");
        }
        else {
            System.out.println("burada kelimesi yoktur");
        }
​
        Thread.sleep(2000);
​
        //siteden kaynakli geri gitme bir seferde olmadigi icin boyle bir condition ile senaryo gerceklestirilebilir
​
        while (driver.getCurrentUrl().equals("https://www.hepsiburada.com/")) {
            driver.navigate().back();
        }
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();
​
    }

 */
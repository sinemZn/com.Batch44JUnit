package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Question1
        //1.https://www.youtube.com sayfasına gidin
        driver.get("https://www.youtube.com");

        //2.Title i consolda yazdirin
        System.out.println(driver.getTitle());

        //3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
        String actualTitle=driver.getTitle();
        String arananKelime="youtube";


        if (actualTitle.equalsIgnoreCase(arananKelime)) {
            System.out.println("title test pass");
        }else{
            System.out.println("title test failed");
        }
        //4.Sayfayi kapatin
        driver.close();
        //5.Tum sayfalari kapatin
        driver.quit();
        //6.Consola “Test completed” yazdirin
        System.out.println("test completed");

        //hocanin cozumu:
        //System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        //       WebDriver driver=new ChromeDriver();
        //​/   driver.get("https://www.youtube.com");
        //        String title= driver.getTitle();
        //
        //        System.out.println(title);
        //​
        //
        //        if (title.equals("YouTube"){
        //            System.out.println("CORRECT TITLE");
        //        }else {
        //            System.out.println("INCORRECT TITLE");
        //        }
        //​
        //
        //        driver.close();
        //​
        //
        //        driver.quit();
        //​
        //        System.out.println("Test is completed");


    }
}

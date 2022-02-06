package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        //2.  Bir mail adersi giriniz
        WebElement userElement= driver.findElement(By.cssSelector("#email"));
        userElement.sendKeys("ali@gmail.com");
        //3.  Bir password giriniz
        WebElement passwordBox = driver.findElement(By.cssSelector("#password"));
        //4.  Login butonuna tiklayiniz
        WebElement loginButton=driver.findElement(By.xpath("//button[@name='commit']"));
        loginButton.click();
        //5.  "There was a problem with your login." texti gorunur ise
        WebElement alert= driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        //6.  "kayit yapilamadi" yazdiriniz
        if (alert.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }else{
            System.out.println("kayit yapildi");
        }
        //8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        //9.  Tum sayfalari kapatiniz
          driver.quit();



    }
}

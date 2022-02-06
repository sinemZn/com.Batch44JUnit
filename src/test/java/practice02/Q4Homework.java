package practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class Q4Homework {
    /*
   ...Exercise5...
  @BeforeClass ın icerisinde driver i kuralim
  maximize edip tum web elementler yuklenene kadar 10 sn bekletelim
  Google 'a gidelim ve sayfa basliginin Google icerdigini dogrulayalim
  Amazon'a gidelim ve url in www.amazon.com icerip icermedigini dogrulayalim
  @AfterClass ta driver ı kapatalim*/

   static WebDriver driver;

    @BeforeClass
    public static void setUp(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

    @Test
    public void test01(){
       driver.navigate().to("https://www.google.co.uk");
       String titleGoogle= driver.getTitle();
        Assert.assertTrue(titleGoogle.contains("Google"));
    }
    @Test
    public void test02(){
        driver.navigate().to("www.amazon.com");
        String urlAmazon= driver.getCurrentUrl();
        Assert.assertTrue(urlAmazon.contains("amazon"));
    }
    @AfterClass
    public static void tearDown(){

    }

  }
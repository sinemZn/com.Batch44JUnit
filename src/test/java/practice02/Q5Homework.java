package practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Q5Homework {

    /*
   ...Exercise6...
// 1. Amazon.com'a gidelim.
// 2. DropDown üzerinde Books secelim.(All yazan yerde)
//    kategorilerin hepsini konsola yazdiralim
// 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
// 4. Sonuc sayisini ekrana yazdiralim.
// 5. Sonucların Les Miserables i icerdigini assert edelim

*/  static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);

        select.selectByVisibleText("Books");
        List<WebElement> options = select.getOptions();
        for (WebElement w : options) {
            System.out.println(w.getText());
        }
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Les Miserables"+ Keys.ENTER);

        WebElement resultText= driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println("resultText = " + resultText);

        WebElement actualResult= driver.findElement(By.xpath("//span[@dir='auto'][3]"));
        String actualText= actualResult.getText();
        String expectedText="Les Miserables";
        Assert.assertTrue(actualText.contains(expectedText));

            }

        }

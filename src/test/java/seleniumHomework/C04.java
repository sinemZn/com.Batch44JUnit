package seleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        WebElement signIn= driver.findElement(By.cssSelector("#sign-in"));
        signIn.click();
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox= driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@type='password']"));
        WebElement signInButton=driver.findElement(By.xpath("//input[@name='commit']"));
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();
        // i. Username : testtechproed@gmail.com
        // ii.Password : Test1234!
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement verifyUserId= driver.findElement(By.tagName("h1"));
        String actualText=verifyUserId.getText();
        String expectedText="Welcome to Address Book";
        if (actualText.contains(expectedText)){
            System.out.println("userId test passed");
        }else{
            System.out.println("userId test failed\n Actual title: "+ actualText);
        }
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        System.out.println(
          driver.findElement(By.linkText("Addresses")).isDisplayed()
                  ? "address test passed"
                  : "address test failed");
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        //4.Linklerin yazisini nasil yazdirabiliriz
        System.out.println("Sayfadaki link sayisi: " + linkList.size());
        //5. driver i kapatin
        driver.close();




    }




}

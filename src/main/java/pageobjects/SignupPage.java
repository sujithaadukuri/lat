package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SignupPage {
    public static WebDriver driver;
    /*public SignupPage(WebDriver driver){
        this.driver=driver;
    }*/
     public static WebDriver get() {
         System.setProperty("webdriver.ie.driver","C:\\Study\\amazon\\Drivers\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
         driver=new InternetExplorerDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
         String url = "https://www.amazon.in/";
         driver.get(url);
         System.out.println(driver.getTitle());
         //driver.close();
         return  driver;
     }



    public void login(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in securely")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9642289303");
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(Keys.ENTER);
        /*driver.findElement(By.xpath("//input[@id='continue'][@type='submit']")).submit();
        driver.findElement(By.xpath("//input[@id='continue'][@type='submit']")).sendKeys(Keys.ENTER);*/
        driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("sujitha@37");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
        driver.findElement(By.cssSelector("signInSubmit")).click();
        /*String parent=driver.getWindowHandle();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> it=set.iterator();
        while (it.hasNext()) {
            String child=it.next();
            driver.switchTo().window(child);
            driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sujitha@37");
            driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
            driver.findElement(By.cssSelector("signInSubmit")).click();
        }*/

        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a")).click();
    }

    public static void main(String[] args) {
        SignupPage si=new SignupPage();
        SignupPage.get();
        si.login();


    }
}

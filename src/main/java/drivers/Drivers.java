package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Drivers {
    public static WebDriver driver;

    public static WebDriver getinst(String browsers){
      if (browsers.equals("chrome")){
          System.setProperty("webdriver.chrome.driver","C:\\Study\\amazon\\Drivers\\chromedriver_win32\\chromedriver.exe");
          driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          String url="https://www.zomato.com/";
          driver.get(url);
      }
      else if (browsers.equals("ie")){
          System.setProperty("webdriver.ie.driver","C:\\Study\\amazon\\Drivers\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
          driver=new InternetExplorerDriver();
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          String url="https://www.zomato.com/ncr";
          driver.get(url);
          //driver.close();
      }
      else if (browsers.equals("firefox")){
          System.setProperty("webdriver.gecko.driver","C:\\Study\\amazon\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
          driver=new FirefoxDriver();
          driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          String url="https://www.myntra.com/";
          driver.get(url);
      }
      return driver;


}
}

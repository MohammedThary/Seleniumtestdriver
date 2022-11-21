package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
   private WebDriver driver;

   public void setUp(){
System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
driver = new ChromeDriver();
//driver.manage().window().setSize(new Dimension(375,812));
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/");
      System.out.println(driver.getTitle());
   //   driver.quit();
   }
   //test

   public static void main(String[] args) {
      BaseTests test = new BaseTests();
      test.setUp();
   }

}

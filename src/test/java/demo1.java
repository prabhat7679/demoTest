import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
WebDriver driver;
@Test(priority = 1)
public  void test1() throws InterruptedException {
    ChromeOptions options= new ChromeOptions();
//        options.addArguments("--headless", "--disable-gpu", "--no-sandbox");
    Map<String, String> prefs = new HashMap<>();
//    prefs.put("download.default_directory");
//    options.setExperimentalOption("prefs", prefs);
    driver= new ChromeDriver(options);

    driver.get("https://www.google.com");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    Thread.sleep(1000);
    System.out.println("login successful");

}
    @Test(priority = 2)
    public  void test2(){
      driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("jenkins");

      driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        System.out.println("search jenkins");
    }


}

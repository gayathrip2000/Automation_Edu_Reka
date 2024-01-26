import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Main {

    public  static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

        //Put a Implicit wait,this means that any search for elements on the page could take the time

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.edureka.co/");
        try{
          Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span")).click();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("si_popup_email")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("gayathrigamage222@gmail.com");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
        Thread.sleep(2000);
        actions.click();
        actions.sendKeys("POO@smc123");
        Thread.sleep(2000);
        actions.build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"new_sign_up_optim\"]/div/div/div[2]/div[3]/form/button")));
        Thread.sleep(2000);
        actions.click();
        actions.build().perform();

    }
}
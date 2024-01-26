package edureka;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingAllControls {


    static WebDriver driver;
    public void EdurekaProfile() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","https://start.spring.io/");
        driver = new ChromeDriver();

    }
}

package Setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {
    private WebDriver driver;

    public void openBrowser () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
    }
    public WebDriver getDriver () {
        return driver;
    }
    public void closeBrowser () {
        driver.quit();
    }

}
















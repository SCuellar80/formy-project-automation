import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\copca\\OneDrive\\Trainings\\Selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String OriginalHandler = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles()) {
            Thread.sleep(1000);
            driver.switchTo().window(handle1);
        }
        Thread.sleep(1000);
        driver.switchTo().window(OriginalHandler);

        //driver.quit();
    }
}

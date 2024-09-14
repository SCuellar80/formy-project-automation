import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import javax.swing.text.html.Option;


public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\copca\\OneDrive\\Trainings\\Selenium\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        Thread.sleep(2000);
        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        Thread.sleep(2000);

        WebElement Option2 = driver.findElement(By.cssSelector("body > div > div > div > a:nth-child(2)"));
        Option2.click();
        Thread.sleep(2000);

        driver.quit();
        Thread.sleep(2000);
    }
}

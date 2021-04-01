import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static public void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.microsoft.com/uk-ua/microsoft-teams/free");
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import URLCheck

public class App {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/61451/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver webdriver = new ChromeDriver();
        AddCart ac = new AddCart();
        ac.addCart();

    }
}

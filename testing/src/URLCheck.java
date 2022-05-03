import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLCheck {
    public static void main(String[] args) throws Exception {
        /**
         * 1.This class tests all the menu URLS related to the website and all the tests
         * are passed
         */

        System.setProperty("webdriver.chrome.driver", "C:/Users/61451/Downloads/chromedriver_win32/chromedriver.exe");
        DriverSetup driver = new DriverSetup();
        driver.setUpWebDriver();

        WebDriver webdriver = new ChromeDriver();
        String landingURL = "https://jupiter.cloud.planittesting.com/#/";
        String shopURL = "https://jupiter.cloud.planittesting.com/#/shop";
        String contactURL = "https://jupiter.cloud.planittesting.com/#/contact";
        String loginURL = "https://jupiter.cloud.planittesting.com/#/login";
        String cartURL = "https://jupiter.cloud.planittesting.com/#/cart";

        webdriver.get(landingURL);
        Thread.sleep(3000);
        webdriver.get(shopURL);
        Thread.sleep(5000);
        webdriver.get(contactURL);
        Thread.sleep(5000);
        webdriver.get(cartURL);
        Thread.sleep(5000);
        webdriver.get(loginURL);

    }

}

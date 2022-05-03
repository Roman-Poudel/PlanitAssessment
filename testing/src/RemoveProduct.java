
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RemoveProduct {
    public static void main(String[] args) throws Exception {
        /**
         * This class test the cart manipulation process
         * 1. By selecting Single item
         * 2. By Selecting Multiple item
         * 3. Removing all from cart
         */
        productRemoveTest();

    }

    static void productRemoveTest() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/61451/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();

        webdriver.get("https://jupiter.cloud.planittesting.com/#/shop");
        // Testing weather payment system works or not
        webdriver.findElement(By.cssSelector("#product-1 > div > p > a")).click();

        Thread.sleep(500);
        webdriver.findElement(By.linkText("Buy")).click();
        Thread.sleep(500);

        webdriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/div/p/a")).click();
        Thread.sleep(500);
        webdriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[8]/div/p/a")).click();
        Thread.sleep(200);

        webdriver.get("https://jupiter.cloud.planittesting.com/#/cart");
        Thread.sleep(2000);
        webdriver.findElement(By.linkText("Empty Cart")).click();
        // Removing all the items
        webdriver.switchTo().alert().accept();
        // Remove comment to not to delete all items in the cart
        // webdriver.switchTo().alert().dismiss();

    }

}

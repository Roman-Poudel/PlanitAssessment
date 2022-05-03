
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BuyProduct {
    public void purchaseProduct() throws Exception {
        /**
         * This class test the fully checkout process
         * 1. By selecting Single item
         * 2. By Selecting Multiple item
         * 3. Listing all the carts
         * 4. Editing the quantity
         * 4. Checking out without filling the form (More importantly Card details)
         * 5. Finally, Checking out which is successfull
         */
        DriverSetup driver = new DriverSetup();
        driver.setUpWebDriver();

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
        Thread.sleep(500);

        webdriver.get("https://jupiter.cloud.planittesting.com/#/cart");
        Thread.sleep(5000);
        // Please comment all the lines below to test the empty form or
        // send the keys empty to checkout without filling information
        webdriver.findElement(By.xpath("//*[@name='quantity']")).clear();
        webdriver.findElement(By.xpath("//*[@name='quantity']")).sendKeys("4");
        Thread.sleep(4000);
        webdriver.findElement(By.linkText("Check Out")).click();
        Thread.sleep(5000);
        webdriver.findElement(By.xpath("//*[@id='forename']")).sendKeys("Roman");
        webdriver.findElement(By.xpath("//*[@id='surname']")).sendKeys("Poudel");
        webdriver.findElement(By.xpath("//*[@id='email']")).sendKeys("Poudelroman94@gmail.com");
        webdriver.findElement(By.xpath("//*[@id='telephone']")).sendKeys("061424585308");
        webdriver.findElement(By.xpath("//*[@id='address']"))
                .sendKeys("8 Cowper Street, Parramatta, 2150, NSW");
        Select cardSelect = new Select(webdriver.findElement(By.name("cardType")));
        cardSelect.selectByIndex(2);
        webdriver.findElement(By.xpath("//*[@id='card']"))
                .sendKeys("1234 5678 8910 1112");
        Thread.sleep(1000);
        webdriver.findElement(By.xpath("//*[@id='checkout-submit-btn']")).click();

        // test cases passed with sending blank form and fully filled form

    }
}

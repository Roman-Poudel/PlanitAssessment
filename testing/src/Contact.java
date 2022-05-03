import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {
    public void contactFormTest() throws Exception {
        /*
         * 1. Testing without filling the form
         * 2. Testing with partial form
         * 3. Testing with fully filled form
         * 4. Testing with invalid form data (Failed for invalid email)
         */
        DriverSetup driver = new DriverSetup();
        // DriverSetup driver = new DriverSetup();
        driver.setUpWebDriver();

        WebDriver webdriver = new ChromeDriver();
        webdriver.get("https://jupiter.cloud.planittesting.com/#/contact");

        // testing without filling the form
        // please comment below line to check the next test case
        // webdriver.findElement(By.xpath("/html/body/div[2]/div/form/div/a")).click();
        // test passed
        // testing for valid email
        webdriver.findElement(By.xpath("//*[@id='forename']")).sendKeys("Roman");
        webdriver.findElement(By.xpath("//*[@id='surname']")).sendKeys("Poudel");
        webdriver.findElement(By.xpath("//*[@id='email']")).sendKeys("Poudelroman94@gmail.com");
        webdriver.findElement(By.xpath("//*[@id='telephone']")).sendKeys("061424585308");
        webdriver.findElement(By.xpath("//*[@id='message']"))
                .sendKeys("Message");
        // the test case fails for invalid email, message goes to the website even
        // though the email is invalid
        // webdriver.findElement(By.xpath("//*[@id='email']")).sendKeys("invalidemail");
        Thread.sleep(3000);

        webdriver.findElement(By.xpath("/html/body/div[2]/div/form/div/a")).click();

        // test passed

    }
}

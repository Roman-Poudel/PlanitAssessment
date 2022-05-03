import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {
    BuyProduct bp = new BuyProduct();

    public void addCart() throws Exception {
        bp.purchaseProduct();
    }
}

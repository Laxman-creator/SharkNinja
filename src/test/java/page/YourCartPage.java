package page;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helper.BaseClass;

public class YourCartPage extends BaseClass {	
public void remove_item() {
	List<WebElement>list= driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));
	clickonelement(list.get(0));
	
	}


public void validate_remove_button_functionality() {
	WebElement elm=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
	validateText(elm, "1");
	
	
}
	
}

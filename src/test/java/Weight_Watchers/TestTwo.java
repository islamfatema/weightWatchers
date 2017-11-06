package Weight_Watchers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestTwo extends WebDriverFactory {
	@Test
	public void output1() {
		System.out.println(driver.findElement(By.xpath("//body/div/span[5]")).getText());
		System.out.println(driver.findElement(By.xpath("//body/div/span[9]")).getText());
		
	}

}

package Weight_Watchers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestOne extends WebDriverFactory{
	@Test
	public void map1() {

		 List<WebElement> foodName = driver.findElements(By.xpath("//*[@class='title ng-binding']"));
		 List<WebElement> serveSize = driver.findElements(By.xpath("//*[@class='description ng-binding']"));
		 HashMap<String, String> maps = new HashMap<>();
		 for(int i=0;i<foodName.size();i++){
			 maps.put("foodname.getText(i).","serveSize.getText(i)" );

		 }
		 
		 Iterator<Map.Entry<String, String>> it = maps.entrySet().iterator();
		 while(it.hasNext()){
		 
		     System.out.println(it);
		 }
	}
	}

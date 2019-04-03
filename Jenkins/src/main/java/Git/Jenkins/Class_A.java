package Git.Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_A {
	


	
	@Test
	
	public void launchfb()
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver uidiver = new ChromeDriver();
		uidiver.get("https://www.facebook.com");
	}
	

}

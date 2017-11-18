package git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class GitProgram {
	
	public void launch ()
	{
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver h= new ChromeDriver();
		h.get("http://www.seleniumhq.org/download/");
		System.out.println(h.getTitle());
		h.quit();

}
}

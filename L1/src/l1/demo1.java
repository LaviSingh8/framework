/**
 * 
 */
package l1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lavi
 *
 */
public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver	();
		
		driver.get("https://google.com");
		
		String x =driver.findElement(By.xpath("//*[@class='LX3sZb']/div/div/div/div/div[2]/a")).getText();
		System.out.println(x);
		driver.findElement(By.xpath("//div                                                                                                                                                                                                                                                                                                                                                 CC[@class='LX3sZb']/div/div/div/div/div[2]/a")).click();
		//driver.close();
		
		
		
		
		
		
		
		
	}

}

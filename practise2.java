package Day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//open browser
				//ChromeDriver driver = new ChromeDriver();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//open url of amazon
				driver.get("https://www.amazon.in/ref=nav_logo");
				
				
				String actualtitle = driver.getTitle();
				System.out.println(actualtitle);
				String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				if (actualtitle.equals (expectedTitle))
				{
					System.out.println("it's a Amazon.in webpage ");
				}
				else
				{
					System.out.println("it's not a Amazon.in webpage"); 
				}
				//driver.findElement(By.xpath("//div[@class= 'nav-search-scope nav-sprite']")).click();
				 driver.close();
			}

			
				
					
	

}

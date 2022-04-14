

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("opeing Braoswer...");
		System.setProperty("webdriver.chrome.driver", "E://SeleniumTutorial//Drivers//Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("opeing URL...");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println("counting the checkbox..");
		System.out.println("Total number of check box is: "+ driver.findElements(By.xpath("//div[@class='right-align'] //input[@type='checkbox']")).size());
	}

}

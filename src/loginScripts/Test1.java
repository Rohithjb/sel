package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("username")).sendKeys("qwerrerrt");
    driver.findElement(By.name("password")).sendKeys("1243567rsdzxrgt");
	driver.findElement(By.xpath("(//div[contains(@class,'_ab8w')])[4]")).click();

	
	String acttitle = driver.getTitle();
	if(acttitle.equals("Instagram")) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}

}

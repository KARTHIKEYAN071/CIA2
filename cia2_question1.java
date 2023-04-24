package CIA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cia2_question1 {
	@Test
	public  void Test1() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.navigate().to("https://www.trivago.in/");
		driver.manage().window().maximize();
		String title="trivago.in - Compare hotel prices worldwide";
		String actual=driver.getTitle();
		if(title.equals(actual))
				{
			System.out.println("'"+driver.getTitle()+"' - is valid Title");
		}
		else
		{
			System.out.println(driver.getTitle()+" is not valid Title");
		}
		WebElement stay=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/div/form/div[1]"));
		stay.click();
		WebElement stayin=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
		stayin.sendKeys("Chennai");
		Thread.sleep(3000);
		WebElement stayarea=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[1]/div/div"));
		stayarea.click();
		Thread.sleep(3000);
		WebElement datein=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[16]/time"));
		datein.click();		
		Thread.sleep(2000);
		WebElement dateout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[17]/time"));
		dateout.click();
		Thread.sleep(2000);
		WebElement adult=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
		adult.click();
		Thread.sleep(1000);
		adult.click();
		Thread.sleep(1000);
		adult.click();
		Thread.sleep(1000);
		adult.click();
		Thread.sleep(2000);
		WebElement rooms=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[3]/div/button[2]/span/span[1]"));
		rooms.click();
		WebElement pet=driver.findElement(By.xpath("//*[@id=\"checkbox-13\"]"));
		pet.click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button"));
		search.click();
		
	}

}

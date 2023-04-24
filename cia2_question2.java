package CIA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cia2_question2 {
	public class cia2_question1 {
		@Test
		public void Test1() throws InterruptedException{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.navigate().to("https://www.trivago.in/en-IN/lm/hotels-bengaluru-india?search=200-64975;dr-20230512-20230513");
			driver.manage().window().maximize();
			String title="Bengaluru Hotels | Find & compare great deals on trivago";
			String actual=driver.getTitle();
			if(title.equals(actual))
			{
				System.out.println("'"+driver.getTitle()+"' - is valid Title");
			}
			else
			{
				System.out.println(driver.getTitle()+" is not valid Title");
			}
			Thread.sleep(36000);
			WebElement search=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[4]/div/form/div[3]/button"));
			search.click();
			WebElement close=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[1]/button/span[2]"));
			close.click();
			Thread.sleep(2000);
			WebElement sort=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]"));
			sort.click();
			Thread.sleep(800);
			WebElement sortele=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[3]"));
			sortele.click();
			Thread.sleep(800);
			
			WebElement fst=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement price1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p"));
			System.out.println("First Hotel in Price and Recommended : "+fst.getText()+" Price : "+price1.getText());
			Thread.sleep(2000);
			WebElement prionly=driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[6]"));
			prionly.click();
			Thread.sleep(800);
			WebElement fstpri=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement price2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p"));
			System.out.println("First Hotel in Price Only : "+fstpri.getText()+" Price : "+price2.getText());
			WebElement stays=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]/strong"));
			WebElement noofbook=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[2]/span[2]/strong"));
			System.out.println("Stays found : "+stays.getText()+" Booking sites searched: "+noofbook.getText());
		}
	}
}

package CIA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cia2_question3 {
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
			Thread.sleep(36000);
			WebElement search=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[4]/div/form/div[3]/button"));
			search.click();
			WebElement close=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[1]/button/span[2]"));
			close.click();
			Thread.sleep(2000);
			WebElement h1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement h2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[2]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement h3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[3]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement h4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[4]/div/article/div[2]/div[1]/section/h2/button/span"));
			WebElement h5=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[5]/div/article/div[2]/div[1]/section/h2/button/span"));
			System.out.println(h1.getText());
			System.out.println(h2.getText());
			System.out.println(h3.getText());
			System.out.println(h4.getText());
			System.out.println(h5.getText());
			WebElement deal=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[2]/button"));
			deal.click();
			WebElement expect=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span"));
			System.out.println(expect.getText());

			
			
			
			
		}
		}

}

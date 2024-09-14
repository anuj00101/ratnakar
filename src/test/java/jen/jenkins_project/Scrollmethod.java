package jen.jenkins_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollmethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(1000);
		//js.executeScript("window.scroll(0,5000)");
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,500)");
		driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
		
		
		
	}

}

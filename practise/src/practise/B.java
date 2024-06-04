package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	/*	WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("iglhgigdskjnblg");
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("EnjoyPandagoww");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));
		System.out.println(errorMsg.getText());  */
		
	/*	WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("hemanthhemu1274@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("kigfiiugghladhu");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//li[text()='The credentials provided are incorrect']"));
		System.out.println(errorMsg.getText());	*/
		
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("hemanthhemu12@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Hemanth@95");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//li[text()='No customer account found']"));
		System.out.println(errorMsg.getText());
		
		driver.quit();
	}
}

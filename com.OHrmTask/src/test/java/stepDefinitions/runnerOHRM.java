package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class runnerOHRM{
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("I enter {string} as username")
	public void i_enter_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    un.sendKeys(string);
	}
	

	@When("I enter {string} as password")
	public void i_enter_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 WebElement pw=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		   pw.sendKeys(string);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 WebElement btn=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
		    btn.click();
	}

//	@Then("the user should see the {string}")
//	public void i_should(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		WebElement dash=driver.findElement(By.xpath("//h6"));
//	    String txt=dash.getText();
//	    Assert.assertEquals(txt,string);
//	}

//	@Then("I should {string}")
//	public void i_should(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	
//		List<WebElement> elements= driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']/p"));
//	    for (WebElement element:elements){
//	    	if(element.getText().equals(string)) {
//	           Assert.assertEquals(element.getText(),string);
//	           break;
//	    	}
//	        }
//	}
	@Then("I shouldd {string}")
	public void i_shouldd(String string) {
		WebElement dash=driver.findElement(By.xpath("//h6"));
	    String txt=dash.getText();
	    Assert.assertEquals(txt,string);
	}
	@Then("check the {string}")
	public void check_the(String string) {
		List<WebElement> elements= driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']/p"));
	    for (WebElement element:elements){
	    	if(element.getText().equals(string)) {
	           Assert.assertEquals(element.getText(),string);
	           break;
	    	}
	        }
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
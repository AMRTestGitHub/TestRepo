package cucumberJava; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class annotation { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() {
	   String exePath = "C:\\Users\\mameerba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
      driver = new ChromeDriver(); 
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.navigate().to("https://www.toolsqa.com/automation-practice-form/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton() { 
      if(driver.findElement(By.id("photo")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.quit(); 
   } 
}
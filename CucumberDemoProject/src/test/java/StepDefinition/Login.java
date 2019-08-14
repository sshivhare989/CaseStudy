package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;

	@Given("^user is on the DemoWebShop login page$")
	@BeforeMethod
	public void user_is_on_the_DemoWebShop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enters the username \"([^\"]*)\"$")
	public void user_enters_the_username(String arg1) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(arg1);
	}

	@When("^user enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String arg1) throws Throwable {
		driver.findElement(By.id("Password")).sendKeys(arg1);

	}

	@Then("^Then user can do successful login$")
	public void then_user_can_do_successful_login() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
		System.out.println("Successfully Logged in");
	}

}

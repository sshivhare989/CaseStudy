package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRegister {
	WebDriver driver;

	
	@Given("^open DemoWebShopApp register page$")
	public void open_DemoWebShopApp_register_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
	}

	@When("^select the Gender as Male")
	public void select_the_Gender_as_Male() throws Throwable {
		driver.findElement(By.id("gender-male")).click();

	}

	@When("^enter firstname as \"([^\"]*)\"$")
	public void enter_firstname_as(String arg1) throws Throwable {
		driver.findElement(By.id("FirstName")).sendKeys(arg1);

	}

	@When("^enter lastname as \"([^\"]*)\"$")
	public void enter_lastname_as(String arg1) throws Throwable {

		driver.findElement(By.id("LastName")).sendKeys(arg1);
	}

	@When("^enter email address as \"([^\"]*)\"$")
	public void enter_email_address_as(String arg1) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(arg1);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("Password")).sendKeys(arg1);
	}

	@When("^enter confirm password as \"([^\"]*)\"$")
	public void enter_confirm_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arg1);
	}

	@When("^Click on register$")
	public void click_on_register() throws Throwable {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("^successfully registered$")
	public void successfully_registered() throws Throwable {
		driver.close();
		System.out.println("Successfully Registered in");

	}

}

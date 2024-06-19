package StepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
@Given("Open Edge Browser")
public void open_edge_browser() {
    driver=new EdgeDriver();
}
@Given("Open URL https:\\/\\/www.saucedemo.com\\/")
public void open_url_https_www_saucedemo_com() {
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
    
}

@When("Login Id Login Password")
public void login_id_login_password() throws InterruptedException {
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	Thread.sleep(3000);
	   driver.findElement(By.name("password")).sendKeys("secret_sauce");
	   Thread.sleep(3000);
	   driver.findElement(By.name("login-button")).click();
}

@When("Click On Submit")
public void click_on_submit() {
	 driver.findElement(By.name("login-button")).click();   
}

@Then("Click on Add to Cart")
public void click_on_add_to_cart() {
	driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
}

@Then("Open Add to Cart")
public void open_add_to_cart() {
	driver.findElement(By.id("shopping_cart_container")).click();  
}

@Then("Click Check Out")
public void click_check_out() {
	driver.findElement(By.id("checkout")).click();
  
}

@Then("Check out your information")
public void check_out_your_information() {
	driver.findElement(By.id("first-name")).sendKeys("Sriram");
	   driver.findElement(By.id("last-name")).sendKeys("Garikipati");
	   driver.findElement(By.id("postal-code")).sendKeys("521001"); 
}

@Then("Click on continue")
public void click_on_continue() {
	driver.findElement(By.id("continue")).click();
}

@Then("Click on Finish")
public void click_on_finish() {
	driver.findElement(By.id("finish")).click();  
}

@Then("Click on Back Home")
public void click_on_back_home() {
	 driver.findElement(By.id("back-to-products")).click();
}

@Then("Logout")
public void logout() {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	   driver.findElement(By.id("logout_sidebar_link")).click();
   
}

@Then("Close Edge Browser")
public void close_edge_browser() {
	driver.close();
}



}

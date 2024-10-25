package com.facebook.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.facebook.runner.Runner_class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_runner {
	
	static WebDriver driver=Runner_class.driver;

	
	@Given("user Launch Facebook Application Url")
	public void user_launch_facebook_application_url() {
	    driver.get("https://www.facebook.com/login.php/");
	   
	}
	
	@When("user Enter The Username")
	public void user_enter_the_username() {
		driver.findElement(By.id("email")).sendKeys("ASDF");
	
	}
	  
	@And("user Enter The Password")
	public void user_enter_the_password() {
		driver.findElement(By.id("pass")).sendKeys("23456");
	   
	}
	@Then("user Click The Login Button And Navigate To Next Page")
	public void user_click_the_login_button_and_navigate_to_next_page() {
		driver.findElement(By.name("login")).click();
	   
	}



	
}

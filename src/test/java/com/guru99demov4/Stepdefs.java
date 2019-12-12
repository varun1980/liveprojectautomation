package com.guru99demov4;

import com.guru99demov4.Utils.Driver;
import com.guru99demov4.pages.BankManagerHomePage;
import com.guru99demov4.pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import static com.guru99demov4.Utils.Driver.getDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Stepdefs {

        WebDriver driver;
        LoginPage loginPage;
        BankManagerHomePage bankManagerHomePage;


@Before
public void setUp(){
        //Get the driver for the browser (e.g. ChromeDriver)
        driver = Driver.getDriver();
        loginPage = new LoginPage(driver);
        bankManagerHomePage = new BankManagerHomePage(driver);
        //Navigate to the URL of our webpage
        driver.get(Driver.getUrl());
        }

@After
public void tearDown(){
        driver.quit();
        }
@Given("I am logged out")
public void i_am_logged_out() {
        assertEquals("We're not on the Login Page","Guru99 Bank Home Page", loginPage.getPageTitle());
        }

@When("I enter username {string} and password {string}")
public void i_enter_username_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        }

@Then("the user is informed that the login is successful")
public void the_user_is_informed_that_the_login_is_successful() {
    assertThat("Login failed or the Login Successful message didn't appear", bankManagerHomePage.checkForSuccessfulLoginMessage(),containsString ("Welcome To Manager's Page of Guru99 Bank"));
    assertThat("Manager ID",bankManagerHomePage.checkMngID(),containsString("mngr236159"));
    System.out.println(bankManagerHomePage.checkMngID());
}

        @When("I enter invalid username {string} and invalid password {string}")
        public void i_enter_invalid_username_and_invalid_password(String username, String password) {
                loginPage.enterUsername(username);
                loginPage.enterPassword(password);
                loginPage.clickLoginButton();
        }

        @Then("the user is informed that the login is unsuccessful")
        public void the_user_is_informed_that_the_login_is_unsuccessful() {

                try {
                        loginPage.alertMessage();
                } catch (Exception e) {
                        e.printStackTrace();
                }

                }}
package com.guru99demov4.pages;

import com.guru99demov4.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static com.guru99demov4.Utils.Driver.getDriver;

@RequiredArgsConstructor
public class LoginPage {
    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver driver;

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void enterUsername (String username){
        driver.findElement(locators.getUsernameLocator()).sendKeys(username);
    }
    public void enterPassword (String password){
        driver.findElement(locators.getPasswordLocator()).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(locators.getLoginbuttonLocator()).click();
    }
        /**
         * Alert message
         */
        public void alertMessage(){


            /*********************************
             * Alert Message handling
             *********************************/

            // Switching to Alert
            Alert alert = getDriver().switchTo().alert();

            // Capturing alert message.
            String alertMessage= getDriver().switchTo().alert().getText();

            // Displaying alert message
            System.out.println(alertMessage);

            // Accepting alert
            alert.accept();



        }
    }
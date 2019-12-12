package com.guru99demov4.pages;

import com.guru99demov4.Utils.Waits;
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
        Waits.waitForElement(locators.getUsernameLocator(),driver).sendKeys(username);
    }
    public void enterPassword (String password){
        Waits.waitForElement(locators.getPasswordLocator(),driver).sendKeys(password);
    }
    public void clickLoginButton() {
        Waits.waitForElement(locators.getLoginbuttonLocator(),driver).click();
    }
        /**
         * Alert message
         */
        public void  alertMessage  (){


            /*********************************
             * Alert Message handling
             *********************************/

            // Switching to Alert
           Alert alert = driver.switchTo().alert();

            // Capturing alert message.
          String alertMessage= driver.switchTo().alert().getText();

            // Displaying alert message
        System.out.println(alertMessage);

            // Accepting alert
            alert.accept();

            if (alertMessage.contains("User or Password is not valid")) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }
        }
    }

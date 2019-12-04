package com.guru99demov4.pages.locators;

import lombok.Data;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // Fields
    private By usernameLocator = By.xpath(".//input[@name=\'uid\']");
    private By passwordLocator = By.xpath(".//input[@name='password']");

    //buttons
    private By loginbuttonLocator = By.xpath(".//input[@name='btnLogin']");

}

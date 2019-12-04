package com.guru99demov4.pages;

import com.guru99demov4.Utils.Waits;
import com.guru99demov4.pages.locators.BankManagerHomePageLocators;
import com.guru99demov4.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor

public class BankManagerHomePage {

    BankManagerHomePageLocators bankManagerHomePageLocators = new BankManagerHomePageLocators();
    @NonNull
    WebDriver driver;

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String checkForSuccessfulLoginMessage(){

        return Waits.waitForElement(bankManagerHomePageLocators.getWelcomeMessage(),driver).getText();
}}
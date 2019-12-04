package com.guru99demov4.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class BankManagerHomePageLocators {

    //Welcome Message
    private By welcomeMessage = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
}

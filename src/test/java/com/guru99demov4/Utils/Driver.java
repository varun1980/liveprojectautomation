package com.guru99demov4.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static final String URL = System.getProperty("url", "http://www.demo.guru99.com/V4/");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getUrl() {
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;

        switch (BROWSER.toUpperCase()) {

            case "CHROME":
                //Tell the user which browser we're running our tests on
                System.out.println("Executing on CHROME");

                //Use WebDriverManager to setup our ChromeDriver
                WebDriverManager.chromedriver().setup();

                //Return our Driver
                return new ChromeDriver();

            case "FIREFOX":
                //Tell the user which browser we're running our tests on
                System.out.println("Executing on FIREFOX");

                //Use WebDriverManager to setup our FireFoxDriver
                WebDriverManager.firefoxdriver().setup();

                //Return our Driver
                return new FirefoxDriver();

            case "Internet Explorer":
                //Tell the user which browser we're running our tests on
                System.out.println("Executing on IE");

                //Use WebDriverManager to setup our IEDriver
                WebDriverManager.iedriver().setup();

                //Return our Driver
                return new InternetExplorerDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is undefined");


    }

}}
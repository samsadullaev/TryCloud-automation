package com.TryCloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    // closing access to the object from outside
    private Driver(){}

        // static so it runs first
        private static WebDriver driver;

        public static WebDriver getDriver(){


        if(driver==null){
            String sam;

           String browser= ConfigurationReader.getProperty("browser").toLowerCase();

           switch(browser){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();

               break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();

                   break;

           }
            driver.manage().window().maximize();
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }



        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit(); // this line will kill the session. value will noy be null
            driver = null;
        }
    }
}

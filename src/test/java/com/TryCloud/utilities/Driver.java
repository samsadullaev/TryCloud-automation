package com.TryCloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // closing access to the object from outside
    private Driver() {
    }


    // static so it runs first
        private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

        public static WebDriver getDriver() {


            if (driverPool.get() == null) {

                String browser = ConfigurationReader.getProperty("browser").toLowerCase();

                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());

                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());

                        break;

                }
                driverPool.get().manage().window().maximize();
                 driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }


            return driverPool.get();
        }
        public static void closeDriver () {
            if (driverPool.get() != null) {
                driverPool.get().quit(); // this line will kill the session. value will noy be null
                driverPool.remove();
            }
        }
    }


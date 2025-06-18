package tests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AppiumDriver appiumdriver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:appPackage", "com.zvooq.openplay");
        capabilities.setCapability("appium:appActivity", ".SplashAliasDefault");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:app", System.getProperty("app"));

        appiumdriver = new AppiumDriver(new URL("http://localhost:4723"), capabilities);
    }

    @AfterTest
    public void tearDown() {
        if (appiumdriver != null) {
            appiumdriver.quit();
        }
    }
}
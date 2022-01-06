package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Hook {


    private static WebDriver driver;

    @Before
    public void setUp() {
        try {

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone 6s");
            cap.setCapability("udid", "3e50207ab8abe4aa722dd11a514a822a6082f0d0");
            cap.setCapability("platformName", "iOS");
            cap.setCapability("platformVersion", "13.5.1");
            cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
            //cap.setCapability("appActivity", "com.apple.mobilesafari");

            // caps.setCapability("appActivity",
            //"org.chromium.chrome.browser.document.ChromeLauncherActivity");

            /* ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("w3c", false);
            cap.merge(chromeOptions); */

            URL url = new URL("http://localhost:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, cap);

            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        } catch (Exception exp) {

            System.out.println("Cause is: " + exp.getCause());
            System.out.println("Message is: " + exp.getMessage());
            exp.printStackTrace();
        }

    }

    @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }

    public static WebDriver getDriver() {

        return driver;
    }

}
package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Getter
public class PhoneNumberPage {

    @AndroidFindBy(id = "phone_input")
    private WebElement phoneTestField;

    @AndroidFindBy(id = "country_code_button")
    private WebElement countryCodeButton;

    @AndroidFindBy(id = "login_via_phone_send_code")
    @AndroidFindBy(id = "title")
    private WebElement receiveSmsCodeButton;

    public PhoneNumberPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(5)), this);
    }

    public void goToYourCountryPage() {
        countryCodeButton.click();
    }
}
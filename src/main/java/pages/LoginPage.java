package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Getter
public class LoginPage {

    @AndroidFindBy(id = "regwall_support")
    private WebElement supportButton;

    @AndroidFindBy(id = "regwall_sberid_btn")
    @AndroidFindBy(id = "title")
    private WebElement entranceBySberIdButton;

    @AndroidFindBy(id = "regwall_phone_btn")
    @AndroidFindBy(id = "title")
    private WebElement entranceByPhoneNumberButton;

    @AndroidFindBy(id = "component_checkbox")
    private WebElement termsOfUseCheckBox;

    @AndroidFindBy(id = "regwall_agreement")
    private WebElement termsOfUseText;

    public LoginPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(5)), this);
    }

    public void goToPhoneNumberPage() {
        entranceByPhoneNumberButton.click();
    }

    public void goToChatPage() {
        supportButton.click();
    }

    public boolean isTermsOfUseCheckBoxChecked() {
        return termsOfUseCheckBox.getAttribute("checked").equals("true");
    }
}
package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Getter
public class YourCountryPage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'country_code_title') and @text= 'Ваша страна']")
    private WebElement titleText;

    @AndroidFindBy(id = "country_code_button")
    private WebElement countryCodeButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Вашей страны нет в списке?\nВоспользуйтесь другим способом входа.']")
    private WebElement hintText;

    public YourCountryPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(5)), this);
    }
}
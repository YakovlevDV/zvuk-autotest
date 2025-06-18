package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

@Getter
public class ChatPage {

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'tv_title') and @text= 'Чат']")
    private WebElement titleText;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'l_btn')]/android.widget.TextView[contains(@text, 'Вход в приложение')]")
    private WebElement entranceInAppButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'l_btn')]/android.widget.TextView[contains(@text, 'Вопрос по подписке')]")
    private WebElement questionAboutSubscriptionButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'l_btn')]/android.widget.TextView[contains(@text= 'Ещё')]")
    private WebElement moreButton;

    @AndroidFindBy(id = "iv_attach_file")
    private WebElement attachButton;

    @AndroidFindBy(id = "et_message")
    private WebElement messageTextField;

    @AndroidFindBy(id = "iv_send")
    private WebElement sendButton;

    public ChatPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver, Duration.ofSeconds(5)), this);
    }
}
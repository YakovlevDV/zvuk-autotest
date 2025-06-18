package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChatPage;
import pages.LoginPage;

public class ChatPageTest extends BaseTest {

    @Test(description = "При запуске приложения отображаеся страница Авторизации")
    public void loginPageTest() {
        LoginPage loginPage = new LoginPage(appiumdriver);
        loginPage.goToChatPage();

        ChatPage chatPage = new ChatPage(appiumdriver);

        // Проверяем отображение страницы Чата путем проверки
        // отображения ключевых элементов этой страницы

        // "Текст в закголовке страницы 'Чат' отображается"
        Assert.assertTrue(chatPage.getTitleText().isDisplayed());

        // "Кнопка 'Вход в приложение' отображается"
        Assert.assertTrue(chatPage.getEntranceInAppButton().isDisplayed());

        // "Кнопка 'Вопрос по подписке' отображается"
        Assert.assertTrue(chatPage.getQuestionAboutSubscriptionButton().isDisplayed());

        // "Кнопка 'Ещё' отображается"
        Assert.assertTrue(chatPage.getEntranceInAppButton().isDisplayed());

        // "Кнопка прикрепить вложение отображается"
        Assert.assertTrue(chatPage.getAttachButton().isDisplayed());

        // "Текстовое поле сообщения отображается"
        Assert.assertTrue(chatPage.getEntranceInAppButton().isDisplayed());

        // "Кнопка отправить сообщение отображается"
        Assert.assertTrue(chatPage.getEntranceInAppButton().isDisplayed());
    }
}
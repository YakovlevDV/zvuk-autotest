package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(description = "При запуске приложения отображается страница Авторизации")
    public void loginPageTest() {
        LoginPage loginPage = new LoginPage(appiumdriver);

        // Проверяем отображение страницы Авторизации путем проверки
        // отображения ключевых элементов этой страницы

        // "Кнопка чата '?' не отображается"
        Assert.assertTrue(loginPage.getSupportButton().isDisplayed());

        // "Кнопка 'Войти по Сбер ID' не отображается"
        Assert.assertTrue(loginPage.getEntranceBySberIdButton().isDisplayed());

        // Кнопка 'Войти по номеру телефона' не отображается
        Assert.assertTrue(loginPage.getEntranceBySberIdButton().isDisplayed());

        // Чекбокс условий использования и обработки данных выбран по умолчанию"
        Assert.assertTrue(loginPage.isTermsOfUseCheckBoxChecked());

        // Текст условий использования и обработки данных не отображается
        Assert.assertTrue(loginPage.getTermsOfUseText().isDisplayed());
    }
}
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PhoneNumberPage;
import pages.YourCountryPage;

public class PhoneNumberTest extends BaseTest {

    @Test(description = "При нажатии кнопки 'Войти по номеру телефона' отображается страница Вход по номеру телефона")
    public void phoneNumberPageTest() {
        LoginPage loginPage = new LoginPage(appiumdriver);
        loginPage.goToPhoneNumberPage();

        PhoneNumberPage phoneNumberPage = new PhoneNumberPage(appiumdriver);

        // Проверяем отображение страницы Вход по номеру телефона путем проверки
        // отображения ключевых элементов этой страницы

        // "Кнопка смены кода страны отображается"
        Assert.assertTrue(phoneNumberPage.getCountryCodeButton().isDisplayed());

        // "Поле ввода телефонного номера отображается"
        Assert.assertTrue(phoneNumberPage.getPhoneTestField().isDisplayed());

        // "Кнопка 'Получить СМС-код' отображается"
        Assert.assertTrue(phoneNumberPage.getReceiveSmsCodeButton().isDisplayed());
    }

    @Test(description = "При нажатии кнопки 'Смена кода страны' отображается страница Ваша страна")
    public void yourCountryTest() {
        LoginPage loginPage = new LoginPage(appiumdriver);
        loginPage.goToPhoneNumberPage();

        PhoneNumberPage phoneNumberPage = new PhoneNumberPage(appiumdriver);
        phoneNumberPage.goToYourCountryPage();

        YourCountryPage yourCountryPage = new YourCountryPage(appiumdriver);

        // Проверяем отображение страницы Ваша страна телефона путем проверки
        // отображения ключевых элементов этой страницы

        // "Текст заголовка страницы 'Ваша страна' отображается"
        Assert.assertTrue(yourCountryPage.getTitleText().isDisplayed());

        // Текст подсказки 'Вашей страны нет в списке?...'  отображается
        Assert.assertTrue(yourCountryPage.getHintText().isDisplayed());
    }
}
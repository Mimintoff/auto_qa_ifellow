package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement usernameField = $(byXpath("//input[@id='username']"));
    SelenideElement passwordField = $(byXpath("//input[@id='password']"));
    SelenideElement loginButton = $(byXpath("//input[@id='login']"));

    public void login(String username, String password) {
        usernameField.setValue(username);
        passwordField.setValue(password);
        loginButton.click();
    }
}
package steps;

import elements.loginPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;


public class loginPageSteps extends loginPageElements {


    public static void enterUsername(String username) {
        usernameField.shouldBe(visible, Duration.ofSeconds(30)).setValue(username);//"AT10"

    }

    public static void enterPassword(String password) {
        passwordField.shouldBe(visible, Duration.ofSeconds(30)).setValue(password);//"Qwerty123"

    }

    public static void clickLoginButton() {
        loginButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }


}

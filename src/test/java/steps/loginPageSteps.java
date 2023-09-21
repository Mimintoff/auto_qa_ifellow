package steps;

import elements.loginPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;


public class loginPageSteps extends loginPageElements {



    public static void enterUsername() {
        usernameField.shouldBe(visible, Duration.ofSeconds(30)).setValue("AT10");

    }

    public static void enterPassword() {
        passwordField.shouldBe(visible, Duration.ofSeconds(30)).setValue("Qwerty123");

    }

    public static void clickLoginButton() {
        loginButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }


}

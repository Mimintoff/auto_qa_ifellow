package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.taskPageSteps;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static elements.loginPageElements.*;

public class JiraTestTaskChoice extends taskPageSteps {
    @BeforeAll
    public static void JiraOpen  () {
        open("/");
        usernameField.setValue("AT10");
        passwordField.setValue("Qwerty123");
        loginButton.shouldBe(visible, Duration.ofSeconds(20)).click();

    }
    @Test
    public  void TaskSearchTest(){
        TaskSearchInput.shouldBe(visible, Duration.ofSeconds(30)).click();
        TaskSearchInput.shouldBe(visible, Duration.ofSeconds(20)).setValue("TEST-21967");
        TaskChoice.shouldBe(visible, Duration.ofSeconds(20)).click();
        String version = TaskVersion.shouldBe(visible, Duration.ofSeconds(20)).getText();
        String status= TaskStatus.shouldBe(visible, Duration.ofSeconds(20)).getText();
        System.out.println(version);
        System.out.println(status);
    }
}

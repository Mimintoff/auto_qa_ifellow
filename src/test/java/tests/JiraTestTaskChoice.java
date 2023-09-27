package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.taskPageSteps;

import static com.codeborne.selenide.Selenide.open;
import static steps.loginPageSteps.*;

public class JiraTestTaskChoice extends taskPageSteps {


    @BeforeAll
    public static void JiraOpenAndLogin() {
        open("/");
        enterUsername("AT10");
        enterPassword("Qwerty123");
        clickLoginButton();
    }

    @Test
    public void TaskSearchTest() {
        searchTaskInput("TEST-21967");
        selectTask();
        String version = getTaskVersion();
        String status = getTaskStatus();
        System.out.println("Версия задачи: " + version);
        System.out.println("Статус задачи: " + status);

    }
}

package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.loginPageSteps;
import steps.taskPageSteps;

import static com.codeborne.selenide.Selenide.open;

public class JiraTestTaskChoice extends taskPageSteps {


    @BeforeAll
    public static void JiraOpenAndLogin() {
        open("/");
        loginPageSteps.enterUsername();
        loginPageSteps.enterPassword();
        loginPageSteps.clickLoginButton();
    }

    @Test
    public void TaskSearchTest() {
        taskPageSteps.TaskSearchInput.setValue("TEST-21967");
        taskPageSteps.selectTask();
        String version = taskPageSteps.getTaskVersion();
        String status = taskPageSteps.getTaskStatus();
        System.out.println(version);
        System.out.println(status);
    }
}

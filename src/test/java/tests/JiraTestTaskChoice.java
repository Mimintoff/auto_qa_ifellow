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
        enterUsername();
        enterPassword();
        clickLoginButton();
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

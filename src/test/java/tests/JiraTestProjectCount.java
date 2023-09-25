package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.loginPageSteps;
import steps.projectPageSteps;

import static com.codeborne.selenide.Selenide.open;
import static elements.loginPageElements.*;
import static steps.loginPageSteps.*;

public class JiraTestProjectCount extends projectPageSteps {

    @BeforeAll
    public static void JiraOpen() {
        open("/");
        enterUsername();
        enterPassword();
        clickLoginButton();
    }

    @Test
    public void checkTotalTasks() {
        clickProjectLink();
        clickProjectChoice();
        getProjectCount();
        ProjectCountGeneral();
    }

}

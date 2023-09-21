package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.loginPageSteps;
import steps.projectPageSteps;

import static com.codeborne.selenide.Selenide.open;
import static elements.loginPageElements.*;

public class JiraTestProjectCount extends projectPageSteps {

    @BeforeAll
    public static void JiraOpen() {
        open("/");
        loginPageSteps.enterUsername();
        loginPageSteps.enterPassword();
        loginPageSteps.clickLoginButton();
    }

    @Test
    public void checkTotalTasks() {
        getProjectCount();
        clickProjectChoice();
        clickProjectLink();

        String str = ProjectCount.getText();
        String[] parts = str.split("из");
        String lastPart = parts[parts.length - 1].trim();
        int lastNumber = Integer.parseInt(lastPart);
        System.out.println(lastNumber);
    }

}

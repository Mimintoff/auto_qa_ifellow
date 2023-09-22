package tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.createIssuePageSteps;
import steps.loginPageSteps;

import static com.codeborne.selenide.Selenide.open;

public class JiraTestCreateIssue extends createIssuePageSteps {

    @BeforeAll
    public static void JiraOpen() {
        open("/");
        loginPageSteps.enterUsername();
        loginPageSteps.enterPassword();
        loginPageSteps.clickLoginButton();
    }

    @Test
    public void createNewIssueAndCloseIt() {

        clickCreateButton();
        checkCreateWindow();

        selectProjectField();
        selectProject();
        selectIssueType();
        enterIssueSummary();
        enterIssueDescription();
        selectPriority();
        assignIssueToMe();


        selectIssueDescriptionType();
        selectIssueFixVersion();
        selectIssueEnvironmentType();
        enterIssueEnvironment();
        selectIssueAffectedVersion();
        selectIssueRelatedTasks();
        enterIssueSprint();


        clickCreateIssueButton();
        checkCreatedIssueKey();


        checkIssueStatusInWork();
        clickIssueStatusWorkFlow();
        checkIssueFinalizationWindow();
        clickIssueFinalizationWindowCheckButton();


        checkIssueStatusClosed();
    }

}

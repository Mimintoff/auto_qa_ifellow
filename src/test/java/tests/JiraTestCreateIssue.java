package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.createIssuePageSteps;

import static com.codeborne.selenide.Selenide.open;
import static steps.loginPageSteps.*;

public class JiraTestCreateIssue extends createIssuePageSteps {

    @BeforeAll
    public static void JiraOpen() {
        open("/");
        enterUsername();
        enterPassword();
        clickLoginButton();
    }


    @Test
    @Tag("Проверяем_создание_задачи")
    public void createIssueTest() {
        OpenCreateTaskWindow();
        FillRequiredFields();
        FillFixVersionField();
        FillPriorityField();
        FillLabelsField();
        FillEnvironmentField();
        FillAffectedVersionField();
        selectIssueRelatedTasks();
        assignIssueToMe();
        enterIssueSprint();
        clickCreateIssueButton();

    }

    @Test
    @Tag("Проверяем_закрытие_задачи")
    public void ClosedIssueTest() {

        checkCreatedIssueKey();
        checkCreatedIssueAssignToMe();
        checkIssueStatusInWork();
        clickIssueStatusWorkFlow();
        checkIssueFinalizationWindow();
        clickIssueFinalizationWindowCheckButton();
        checkIssueStatusClosed();


    }
}












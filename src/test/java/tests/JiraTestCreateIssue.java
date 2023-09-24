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

    @Test()
    @Tag("Проверяем_открытие_окна_создания_задачи")
    public void createNewIssueAndCloseIt() {
        OpenCreateTaskWindow();
    }

    @Test
    @Tag("Проверяем_создание_задачи")
    public void createAndCloseIssueTest() {
        FillProjectField();
        FillIssueTypeField();
        FillSummaryField();
        FillDescriptionField();
        FillFixVersionField();
        FillPriorityField();
        FillLabelsField();
        FillEnvironmentField();
        FillAffectedVersionField();
        selectIssueRelatedTasks();
        assignIssueToMe();
        enterIssueSprint();
        clickCreateIssueButton();
        checkCreatedIssueKey();
        checkCreatedIssueAssignToMe();
        checkIssueStatusInWork();
        clickIssueStatusWorkFlow();
        checkIssueFinalizationWindow();
        clickIssueFinalizationWindowCheckButton();

    }

    @Test
    @Tag("Проверяем_статус_закрыто")
    public void CheckStatusClose() {
        checkIssueStatusClosed();
    }
}












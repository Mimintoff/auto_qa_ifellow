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
        enterUsername("AT10");
        enterPassword("Qwerty123");
        clickLoginButton();
    }


    @Test
    @Tag("Проверяем_создание_задачи")
    public void createIssueTest() {

        createIssue();
    }

    private void createIssue() {
        OpenCreateTaskWindow();
        FillRequiredFields("Ошибка", "Ошибка_Тестовая_Описание");
        FillNoRequiredFields();
        checkCreatedIssueKey();
        checkCreatedIssueAssignToMe();
        clickIssueStatusInWork();
        clickIssueStatusWorkFlow();
        clickIssueFinalizationWindowCheckButton();
        checkIssueStatusClosed("РЕШЕННЫЕ");
    }

}












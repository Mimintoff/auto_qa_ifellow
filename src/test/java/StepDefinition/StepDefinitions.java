package StepDefinition;

import hooks.webHooks;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import steps.createIssuePageSteps;

import static com.codeborne.selenide.Selenide.open;
import static steps.loginPageSteps.*;

public class StepDefinitions extends createIssuePageSteps{

    @Дано("{string} и {string} и {string}")
    public static void JiraOpen (String url, String username, String password) {
        open(url);
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }


    @Когда("Cоздается задача")
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
    }

    @Тогда("Задача закрывается")
    public void closeIssue() {
        checkIssueStatusClosed("РЕШЕННЫЕ");
    }
}

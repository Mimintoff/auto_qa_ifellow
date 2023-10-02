package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import steps.createIssuePageSteps;

import static com.codeborne.selenide.Selenide.open;
import static elements.projectPageElements.ProjectCount;
import static steps.loginPageSteps.*;
import static steps.projectPageSteps.projectPageView;


public class StepDefinitions extends createIssuePageSteps {


    @Дано("{string} и {string} и {string}")
    public static void JiraOpen(String url, String username, String password) {
        open(url);
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }


    @Когда("Cоздается задача")
    public void createIssueTest() {
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

    @Когда("Пользователь на странице проекта")
    public void projectView() {
        projectPageView();
    }

    @Тогда("Пользователь видит общее количество проектов")
    public static String projectCountGeneral() {
        String str = ProjectCount.getText();
        String[] parts = str.split("из");
        String lastPart = parts[parts.length - 1].trim();
        int lastNumber = Integer.parseInt(lastPart);
        System.out.println("Общее количество задач: " + lastNumber);
        return str;

    }


}




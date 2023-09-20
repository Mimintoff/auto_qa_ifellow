import elements.CreateIssuePage;
import elements.LoginPage;
import elements.ProjectPage;
import elements.TaskPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class JiraTest {

    @Test
    public void testJira() {
        open("https://edujira.ifellow.ru/");

        LoginPage loginPage = new LoginPage();
        loginPage.login("username", "password");

        ProjectPage projectPage = new ProjectPage();
        projectPage.openProject("TestProject");
        projectPage.checkTotalTasks(30);

        TaskPage taskPage = new TaskPage();
        taskPage.openTask("TestSelenium");
        taskPage.checkStatus("In Progress");
        taskPage.checkAffectedVersion("Version 2.0");

        CreateIssuePage createIssuePage = new CreateIssuePage();
        createIssuePage.createIssue("Bug", "Test description");
        createIssuePage.transitionIssue("Close");
    }
}








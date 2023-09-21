package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.loginPageSteps;
import steps.projectPageSteps;

import static com.codeborne.selenide.Selenide.open;
import static elements.loginPageElements.*;

public class JiraTestProjectCount extends projectPageSteps {

    @BeforeAll
    public static void JiraOpen  () {
        open("/");
        loginPageSteps.enterUsername();
        loginPageSteps.enterPassword();
        loginPageSteps.clickLoginButton();
    }



    @Test
    public void checkTotalTasks() {
        String str = ProjectCount.getText();
        String[] parts = str.split("из");
        String lastPart = parts[parts.length - 1].trim();
        int lastNumber = Integer.parseInt(lastPart);
        System.out.println(lastNumber);

//        int actualTotal = Integer.parseInt($(byXpath("//div[@class='showing']//span")).getText());
//        assert actualTotal == expectedTotal;
//        System.out.println(actualTotal);

    }
////    public void testJira() {
////        open(base);
////
////        loginPageElements loginPageElements = new loginPageElements();
////        loginPageElements.login("username", "password");
////
////        projectPageElements projectPageElements = new projectPageElements();
////        projectPageElements.openProject("TestProject");
////        projectPageElements.checkTotalTasks(30);
////
////        taskPageElements taskPageElements = new taskPageElements();
////        taskPageElements.openTask("TestSelenium");
////        taskPageElements.checkStatus("In Progress");
////        taskPageElements.checkAffectedVersion("Version 2.0");
////
////        createIssuePageElements createIssuePageElements = new createIssuePageElements();
////        createIssuePageElements.createIssue("Bug", "Test description");
////        createIssuePageElements.transitionIssue("Close");



}

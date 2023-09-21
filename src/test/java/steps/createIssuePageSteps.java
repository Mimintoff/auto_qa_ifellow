package steps;

import elements.createIssuePageElements;

import static com.codeborne.selenide.Condition.visible;

public class createIssuePageSteps extends createIssuePageElements {

    public static void clickCreateButton() {
        CreateButton.click();
    }

    public static void checkCreateWindow() {
        CreateWindow.shouldBe(visible);
    }

    public static void selectProject() {
        ProjectField.click();
        ProjectFieldChoice.click();
    }

    public static void selectIssueType() {
        IssueTypeField.click();
        IssueTypeFieldChoice.click();
    }

    public static void enterIssueSummary() {
        IssueSummary.click();
    }

    public static void selectIssueDescriptionType() {
        IssueDescriptionType.click();
    }

    public static void enterIssueDescription() {
        IssueDescription.click();
    }

    public static void selectIssueFixVersion() {
        IssueFixVersion.click();
    }

    public static void selectPriority() {
        PriorityField.click();
    }

    public static void selectIssueEnvironmentType() {
        IssueEnvironmentType.click();
    }

    public static void enterIssueEnvironment() {
        IssueEnvironment.click();
    }

    public static void selectIssueAffectedVersion() {
        IssueAffectedVersion.click();
    }

    public static void selectIssueRelatedTasks() {
        IssueRelatedTasks.click();
    }

    public static void assignIssueToMe() {
        IssueAssignToMe.click();
    }

    public static void enterIssueSprint() {
        IssueSprint.click();
    }

    public static void clickCreateIssueButton() {
        CreateIssueButton.click();
    }
}




package steps;

import elements.createIssuePageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class createIssuePageSteps extends createIssuePageElements {

    public static void clickCreateButton() {
        CreateButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void checkCreateWindow() {
        CreateWindow.shouldBe(visible, Duration.ofSeconds(30));
    }

    public static void selectProjectField() {
            ProjectField.shouldBe(visible, Duration.ofSeconds(30)).click();

    }
    public static void selectProject() {
        ProjectFieldChoice.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueType() {
        IssueTypeField.shouldBe(visible, Duration.ofSeconds(30)).click();
        IssueTypeFieldChoice.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void enterIssueSummary() {
        IssueSummary.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueDescriptionType() {
        IssueDescriptionType.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
    public static void enterIssueDescription() {
        IssueDescription.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueFixVersion() {
        IssueFixVersion.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectPriority() {
        PriorityField.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueEnvironmentType() {
        IssueEnvironmentType.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
    public static void enterIssueEnvironment() {
        IssueEnvironment.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueAffectedVersion() {
        IssueAffectedVersion.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectIssueRelatedTasks() {
        IssueRelatedTasks.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void assignIssueToMe() {
        IssueAssignToMe.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void enterIssueSprint() {
        IssueSprint.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void clickCreateIssueButton() {
        CreateIssueButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void checkCreatedIssueKey() {
        CreatedIssueKey.shouldBe(visible, Duration.ofSeconds(30));
    }

    public void checkIssueStatusInWork() {
        IssueStatusInWork.shouldBe(visible, Duration.ofSeconds(30));
    }

    public void clickIssueStatusWorkFlow() {
        IssueStatusWorkFlow.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void checkIssueFinalizationWindow() {
        IssueFinalizationWindowCheck.shouldBe(visible, Duration.ofSeconds(30));
    }

    public void clickIssueFinalizationWindowCheckButton() {
        IssueFinalizationWindowCheckButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public void checkIssueStatusClosed() {
        checkIssueStatusClosed.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
}




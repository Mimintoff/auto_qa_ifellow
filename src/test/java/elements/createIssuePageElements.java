package elements;

import com.codeborne.selenide.SelenideElement;
import hooks.webHooks;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class createIssuePageElements extends webHooks {

   public static SelenideElement CreateButton = $(byXpath("//a[@id='create_link']"));
   public static SelenideElement CreateWindow = $(byXpath("//body/section[@id='create-issue-dialog']/div[1]"));
   public static SelenideElement ProjectField = $(byXpath("//input[@id='project-field']"));
   public static SelenideElement ProjectFieldChoice = $(byXpath("a[contains(text(),'Test (TEST)')]"));
   public static SelenideElement IssueTypeField = $(byXpath("//div[@id='issuetype-single-select']/span"));
   public static SelenideElement IssueTypeFieldChoice = $(byXpath("//a[contains(text(),'Ошибка')]"));
   public static SelenideElement IssueSummary = $(byXpath("//input[@id='summary']"));
   public static SelenideElement IssueDescriptionType = $(byXpath("(//button[contains(text(),'Текст')])[1]"));
   public static SelenideElement IssueDescription = $(byXpath("//textarea[@id='description']"));
   public static SelenideElement IssueFixVersion = $(byXpath("(//option[contains(text(),'Version 2.0')])[1]"));
   public static SelenideElement PriorityField = $(byXpath("//input[@id='priority-field']"));
   public static SelenideElement IssueEnvironmentType = $(byXpath("(//button[contains(text(),'Текст')])[2]"));
   public static SelenideElement IssueEnvironment = $(byXpath("//textarea[@id='environment']"));
   public static SelenideElement IssueAffectedVersion = $(byXpath("(//option[contains(text(),'Version 1.0')])[2]"));
   public static SelenideElement IssueRelatedTasks = $(byXpath("//select[@id='issuelinks-linktype']"));
   public static SelenideElement IssueAssignToMe= $(byXpath("//button[@id='assign-to-me-trigger']"));
   public static SelenideElement IssueSprint= $(byXpath("(//input[@class =\"text aui-ss-field ajs-dirty-warning-exempt\"])[6]"));
   public static SelenideElement CreateIssueButton= $(byXpath("(//input[@class =\"text aui-ss-field ajs-dirty-warning-exempt\"])[6]"));









}
//    public void createIssue(String issueType, String description) {
//        $(byXpath("//input[@id='issuetype-field']")).setValue(issueType);
//        $(byXpath("//textarea[@id='description']")).setValue(description);
//        $(byXpath("//input[@id='create-issue-submit']")).click();
//    }

//    public void transitionIssue(String transition) {
//        $(byXpath("//a[@id='action_id_5']")).click(); // Закрыть задачу
//    }
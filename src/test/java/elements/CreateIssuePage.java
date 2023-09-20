package elements;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CreateIssuePage {
    public void createIssue(String issueType, String description) {
        $(byXpath("//input[@id='issuetype-field']")).setValue(issueType);
        $(byXpath("//textarea[@id='description']")).setValue(description);
        $(byXpath("//input[@id='create-issue-submit']")).click();
    }

    public void transitionIssue(String transition) {
        $(byXpath("//a[@id='action_id_5']")).click(); // Закрыть задачу
    }
}

package elements;

import com.codeborne.selenide.SelenideElement;
import hooks.webHooks;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class createIssuePageElements extends webHooks {

   public static SelenideElement ProjectLink = $(byXpath("//a[@id='browse_link']"));
   public static SelenideElement ProjectChoice = $(byXpath("//a[@id='admin_main_proj_link_lnk']"));
   public static SelenideElement ProjectCount = $(byXpath("//div[@class='showing']//span[@xpath=\"1\"]"));

}
//    public void createIssue(String issueType, String description) {
//        $(byXpath("//input[@id='issuetype-field']")).setValue(issueType);
//        $(byXpath("//textarea[@id='description']")).setValue(description);
//        $(byXpath("//input[@id='create-issue-submit']")).click();
//    }

//    public void transitionIssue(String transition) {
//        $(byXpath("//a[@id='action_id_5']")).click(); // Закрыть задачу
//    }
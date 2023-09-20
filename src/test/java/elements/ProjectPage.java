package elements;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {
    public void openProject(String projectName) {
        $(byXpath("//a[text()='" + projectName + "']")).click();
    }

    public void checkTotalTasks(int expectedTotal) {
        int actualTotal = Integer.parseInt($(byXpath("//span[@class='results-count-total results-count-link']").getText());
        assert actualTotal == expectedTotal;
    }
}

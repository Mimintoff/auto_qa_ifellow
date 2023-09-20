package elements;

import hooks.webHooks;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class taskPageElements extends webHooks {
    public void openTask(String taskName) {
        $(byXpath("//a[text()='" + taskName + "']")).click();
    }

    public void checkStatus(String expectedStatus) {
        String actualStatus = $(byXpath("//span[@id='status-val']")).getText();
        assert actualStatus.equals(expectedStatus);
    }

    public void checkAffectedVersion(String expectedVersion) {
        String actualVersion = $(byXpath("//span[@id='version-val']")).getText();
        assert actualVersion.equals(expectedVersion);
    }
}
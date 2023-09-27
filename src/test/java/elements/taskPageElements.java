package elements;

import com.codeborne.selenide.SelenideElement;
import hooks.webHooks;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class taskPageElements extends webHooks {

    public static SelenideElement TaskSearchInput = $(byXpath("//input[@id='quickSearchInput']"));
    public static SelenideElement TaskChoice = $(byXpath("//span[contains(text(),'TestSelenium_bug')]"));
    public static SelenideElement TaskStatus = $(byXpath("//span[@id='status-val']"));
    public static SelenideElement TaskVersion = $(byXpath("//span[@id='fixVersions-field']"));


}
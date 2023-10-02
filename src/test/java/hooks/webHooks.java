package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;


public class webHooks {

    @Before
    public static void setupClass() {
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://edujira.ifellow.ru";
        Configuration.timeout = 10000;


    }
}

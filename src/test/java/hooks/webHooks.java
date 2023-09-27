package hooks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class webHooks {

    @BeforeAll

    static void setupClass() {
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://edujira.ifellow.ru";
        Configuration.timeout = 10000;


    }
}

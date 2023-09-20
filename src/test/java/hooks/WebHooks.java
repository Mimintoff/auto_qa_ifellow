package hooks;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {

    @BeforeAll

    static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\CODE");
        WebDriverManager.chromedriver().cachePath("C:\\CODE").avoidOutputTree().setup();
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://edujira.ifellow.ru/";
    }
}

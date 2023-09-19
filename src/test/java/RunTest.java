import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class RunTest {
    @BeforeAll
    static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\CODE");
        WebDriverManager.chromedriver().cachePath("C:\\CODE").avoidOutputTree().setup();
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "normal";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    public void AutomationPracticeForm(){
        open("/automation-practice-form");
    }

    @Before
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }


    @Test
    public void Test1(){
        System.out.println("1");
        assertEquals("2","1");

    }

    @Test
    public void Test2(){
        System.out.println("2");
        assertEquals("2","2");
    }

    @After
    public void AfterClass(){
        System.out.println("AfterClass");
    }

}

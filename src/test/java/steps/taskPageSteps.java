package steps;

import com.codeborne.selenide.Condition;
import elements.taskPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class taskPageSteps extends taskPageElements {

    public static void TaskSearch(){
        TaskSearchInput.shouldBe(visible, Duration.ofSeconds(5)).click();
        TaskSearchInput.setValue("TEST-21967");
        TaskChoice.shouldBe(visible, Duration.ofSeconds(5)).getText();
        TaskStatus.shouldBe(visible, Duration.ofSeconds(5)).getText();
    }
}

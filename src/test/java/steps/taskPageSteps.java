package steps;

import elements.taskPageElements;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;

public class taskPageSteps extends taskPageElements {

    public static void searchTaskInput() {
        TaskSearchInput.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void selectTask() {
        TaskChoice.shouldBe(visible, Duration.ofSeconds(20)).click();

    }

    public static String getTaskStatus() {

        return TaskStatus.shouldBe(visible, Duration.ofSeconds(20)).getText();
    }

    public static String getTaskVersion() {

        return TaskVersion.shouldBe(visible, Duration.ofSeconds(20)).getText();
    }
}

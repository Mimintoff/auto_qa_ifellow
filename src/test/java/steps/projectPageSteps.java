package steps;

import elements.projectPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class projectPageSteps extends projectPageElements {

    public static void clickProjectLink() {
        ProjectLink.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static void clickProjectChoice() {
        ProjectChoice.shouldBe(visible, Duration.ofSeconds(30)).click();
    }

    public static String getProjectCount() {
        return ProjectCount.shouldBe(visible, Duration.ofSeconds(30)).getText();

    }

    public static String ProjectCountGeneral() {
        String str = ProjectCount.getText();
        String[] parts = str.split("из");
        String lastPart = parts[parts.length - 1].trim();
        int lastNumber = Integer.parseInt(lastPart);
        System.out.println("Общее количество задач: " + lastNumber);
        return str;

    }


}

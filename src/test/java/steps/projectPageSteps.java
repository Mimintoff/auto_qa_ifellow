package steps;

import elements.projectPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class projectPageSteps extends projectPageElements {

    public static void projectPageView(){
        ProjectLink.shouldBe(visible, Duration.ofSeconds(30)).click();
        ProjectChoice.shouldBe(visible, Duration.ofSeconds(30)).click();
        ProjectSearch.shouldBe(visible, Duration.ofSeconds(30)).pressEnter();
    }




    public static String projectCountGeneral() {
        String str = ProjectCount.getText();
        String[] parts = str.split("из");
        String lastPart = parts[parts.length - 1].trim();
        int lastNumber = Integer.parseInt(lastPart);
        System.out.println("Общее количество задач: " + lastNumber);
        return str;

    }


}

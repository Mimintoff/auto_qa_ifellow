package steps;

import elements.projectPageElements;

public class projectPageSteps extends projectPageElements {

    public static void clickProjectLink() {
        ProjectLink.click();
    }

    public static void clickProjectChoice() {
        ProjectChoice.click();
    }

    public static String getProjectCount() {
        return ProjectCount.getText();
    }


}

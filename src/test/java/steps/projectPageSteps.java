package steps;

import elements.projectPageElements;

public class projectPageSteps extends projectPageElements {

    public static void CreateProject(){

        ProjectLink.click();
        ProjectChoice.click();
        ProjectCount.click();

    }


}

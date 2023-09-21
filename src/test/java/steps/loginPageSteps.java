package steps;

import elements.loginPageElements;

public class loginPageSteps extends loginPageElements {


    public static void Login(){
        usernameField.click();
        passwordField.click();
        loginButton.click();

    }


}

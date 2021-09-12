package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME_INPUT = Target.the("Username Input").located(MobileBy.AccessibilityId("test-Username"));
    public static final Target PASSWORD_INPUT = Target.the("Password Input").located(MobileBy.AccessibilityId("test-Password"));
    public static final Target LOGIN_BUTTON = Target.the("Login Button").located(MobileBy.AccessibilityId("test-LOGIN"));

}

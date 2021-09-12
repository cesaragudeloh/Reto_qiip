package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {


    public static final Target FIRST_NAME_INPUT = Target.the("Fistname Input").located(MobileBy.AccessibilityId("test-First Name"));
    public static final Target LAST_NAME_INPUT = Target.the("Lastname Input").located(MobileBy.AccessibilityId("test-Last Name"));
    public static final Target POSTAL_CODE_INPUT = Target.the("Postal Code Input").located(MobileBy.AccessibilityId("test-Zip/Postal Code"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue Button").located(MobileBy.AccessibilityId("test-CONTINUE"));
    public static final Target CANCEL_BUTTON = Target.the("Cancel Button").located(MobileBy.AccessibilityId("test-CANCEL"));
    public static final Target FINISH_BUTTON = Target.the("Finish Button").located(MobileBy.AccessibilityId("test-FINISH"));


}

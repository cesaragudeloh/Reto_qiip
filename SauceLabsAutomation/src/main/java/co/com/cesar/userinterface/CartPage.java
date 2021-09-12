package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target REMOVE_BUTTON = Target.the("Remove Product Button").located(MobileBy.AccessibilityId("test-REMOVE"));
    public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Continue Shopping Button").located(MobileBy.AccessibilityId("test-CONTINUE SHOPPING"));
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout Button").located(MobileBy.AccessibilityId("test-CHECKOUT"));
}

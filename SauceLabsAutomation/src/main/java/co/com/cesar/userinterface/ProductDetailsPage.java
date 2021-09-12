package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailsPage {

    public static final Target ADD_TO_CART_BUTTON = Target.the("Button Add Product to Cart").located(MobileBy.AccessibilityId("test-ADD TO CART"));
    public static final Target BACK_TO_PRODUCTS_BUTTON = Target.the("Button Back to the Products List").located(MobileBy.AccessibilityId("test-BACK TO PRODUCTS"));

}

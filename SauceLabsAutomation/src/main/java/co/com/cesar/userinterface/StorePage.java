package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class StorePage {

    public static final Target PRODUCT_NAME = Target.the("Product name label").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target SHOP_CART_BUTTON = Target.the("Shoping Cart Button").located(MobileBy.AccessibilityId("test-Cart"));
}

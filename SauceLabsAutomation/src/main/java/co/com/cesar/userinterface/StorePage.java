package co.com.cesar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class StorePage {

    public static final Target PRODUCT_NAME = Target.the("Product name label").locatedBy("//android.widget.TextView[@text='{0}']");

}

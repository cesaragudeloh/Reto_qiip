package co.com.cesar.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutComplete {

    public static final Target CHECKOUT_COMPLETE_TITLE = Target.the("Checkout complete label").located(MobileBy.xpath("//android.widget.TextView[@text='CHECKOUT: COMPLETE!']"));
    public static final Target THANKS_ORDER_LABEL = Target.the("Checkout complete label").located(MobileBy.xpath("//android.widget.TextView[@text='THANK YOU FOR YOU ORDER']"));
    public static final Target DETAIL_ORDER_LABEL = Target.the("Detail Order label").located(MobileBy.xpath("//android.widget.TextView[@text='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));

}

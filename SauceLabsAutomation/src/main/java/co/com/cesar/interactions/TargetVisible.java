package co.com.cesar.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class TargetVisible implements Interaction {

    private Target target;

    public TargetVisible(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ThucydidesWebDriverSupport.getProxiedDriver();
        Dimension dimension = driver.manage().window().getSize();
        int xPosition = dimension.width / 2;
        int initialPositionY = dimension.height / 2;
        int finalPositionY = dimension.height / 4;
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        while (!this.target.resolveFor((Actor) actor).isVisible()) {
            action.longPress(PointOption.point(xPosition, initialPositionY));
            action.moveTo(PointOption.point(xPosition, finalPositionY));
            action.release().perform();
        }
    }
}

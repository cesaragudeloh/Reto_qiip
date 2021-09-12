package co.com.cesar.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cesar.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USERNAME_INPUT, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(username).into(USERNAME_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static class LoginWith {

        private String username;
        private String password;

        public LoginWith username(String username) {
            this.username = username;
            return this;
        }

        public Performable andPassword(String password) {
            this.password = password;
            return new Login(username, password);
        }

    }


    public static LoginWith with() {
        return new LoginWith();
    }
}

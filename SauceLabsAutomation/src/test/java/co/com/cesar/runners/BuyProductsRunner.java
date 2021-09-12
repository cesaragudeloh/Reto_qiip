package co.com.cesar.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_products.feature",
        glue = "co.com.cesar.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BuyProductsRunner {
}

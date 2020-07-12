package ui_tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "ui_tests.pages.homePage", "ui_tests.pages.registrationPage", "ui_tests.pages.loginPage", "ui_tests/hooks"},
        plugin = {"pretty"},
        tags="@withdrawal",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "pages.homePage", "pages.registrationPage", "pages.loginPage", "hooks" },
        plugin = {"pretty"},
        tags="@withdrawal",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}

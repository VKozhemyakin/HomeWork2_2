import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void openBrowser () {
        open("https:/demoqa.com/automation-practice-form");
    }
}

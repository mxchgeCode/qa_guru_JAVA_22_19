package tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePageTests extends BaseTest {

    @Test
    void checkCatNameTest() {
        open(baseUrl);
        $("div.col-sm-4:nth-child(2)").shouldHave(text("Serious cat"));
    }
}

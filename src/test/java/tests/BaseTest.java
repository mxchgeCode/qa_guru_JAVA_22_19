package tests;
import config.LaunchConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        LaunchConfig config = ConfigFactory.create(LaunchConfig.class, System.getProperties());
        Configuration.baseUrl = "https://suninjuly.github.io/cats.html";
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        Configuration.remote = config.remoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}

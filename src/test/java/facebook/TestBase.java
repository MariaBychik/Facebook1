package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

    public class TestBase {
        public static WebDriver driver;
        public FbLoginPage loginPage;


        @BeforeSuite
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver.exe");
            driver = new ChromeDriver();
            loginPage = new FbLoginPage(driver);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.facebook.com");
        }

        @AfterSuite
        public void TeardownTest() {
            TestBase.driver.quit();
        }
    }


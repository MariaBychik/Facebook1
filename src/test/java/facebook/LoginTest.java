package facebook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void loginTest() {

        FbLoginPage loginPage = new FbLoginPage(driver);

        loginPage.setEmail("pavel@gmail.com");
        loginPage.setPassword("1233qweeQWERTcc#$%");
        loginPage.clickLoginButton();



    }
}

package facebook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
    WebDriver driver;

    public FbLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;


    }

    @FindBy(xpath ="//input[@id='email'][@name='email']")
    WebElement emailTextBox;

    @FindBy(xpath ="//input[@id='pass'][@name='pass']")
    WebElement passwordTextBox;

    @FindBy(xpath="//*[@name= 'login']")
    WebElement loginButton;


    public void setEmail(String strEmail){
        emailTextBox.sendKeys(strEmail);
    }

    public void setPassword (String strPassword){
     passwordTextBox.sendKeys(strPassword);
    }

    public void clickLoginButton (){
       loginButton.click();
    }

}

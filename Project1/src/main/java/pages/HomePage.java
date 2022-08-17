package pages;

import static browser.Browser.getPropertyValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id="txtUsername") private WebElement userNameElement;
    @FindBy(id="txtPassword") private WebElement passwordElement;
    @FindBy(id="btnLogin") private WebElement loginButton;

    public void login(){
        userNameElement.sendKeys(getPropertyValue("userName"));
        userNameElement.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }
}

/*
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {

    private WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@href, 'controller=my-account']")
    private WebElement signIn;

    public void openSingInPage() {
        signIn.click();

    }


    @FindBy
    private void typeEmail(By email_create, String s) {

        createEmailField.sendKeys(s);
    }

    private void submit(By submitCreate) {
        WebElement submitCreateButton = driver.findElement(submitCreate);
        submitCreateButton.click();
    }

}
*/

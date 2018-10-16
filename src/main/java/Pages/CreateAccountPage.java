package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    private WebDriver driver;

    public CreateAccountPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private void firstName(String s, String bob) {
        WebElement createFirstName = driver.findElement(By.xpath(s));
        createFirstName.sendKeys(bob);
    }

   /* @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement customersFirstNameField;
    public void firstName(String customersFirstName) {
        customersFirstNameField.sendKeys(customersFirstName);
    }*/

        @FindBy(id = "customer_lastname")
    private void lastName(String s, String sancho) {
        WebElement createLastName = driver.findElement(By.xpath(s));
        createLastName.sendKeys(sancho);
    }

    @FindBy(id = "passwd")
    private void typePassword(String s, String s2) {
        WebElement createPassword = driver.findElement(By.xpath(s));
        createPassword.sendKeys(s2);
    }


    @FindBy(id = "company")
    private WebElement companyField;
    public void typeCompanyName(String companyName) {
        companyField.sendKeys(companyName);
    }

    @FindBy(id = "address1")
    private void typeAddress(String s, String ocean123) {
        WebElement createAddress = driver.findElement(By.xpath(s));
        createAddress.sendKeys(ocean123);

    }

    @FindBy(id = "city")
    private void typeAnCity(String s, String atlantic) {
        WebElement createCity = driver.findElement(By.xpath(s));
        createCity.sendKeys(atlantic);
    }

    @FindBy(id = "postcode")
        private void typeZip(String s, String s2) {
        WebElement createZip = driver.findElement(By.xpath(s));
        createZip.sendKeys(s2);
    }

    @FindBy(id=)
    private void selectStateDD() {
        WebElement stateDropDown = driver.findElement(By.xpath("//*[@id='id_state']"));
        Select value = new Select(stateDropDown);
        value.selectByValue("5");
    }

    @FindBy(id = "submitAccount")
    private WebElement registerButton;
    public void clickOnRegisterButton() {
        registerButton.click();
    }



}

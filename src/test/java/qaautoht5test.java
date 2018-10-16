import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/*
Написать тест для automationpactice
        Сценарий:
        Открыть главную страницу automationpractice.com
        Открыть форму регистрации нового клиента (Sign in )
        В секции Create an account ввести корректный емейл
        Нажать  Create an account
        На форме регистрации заполнить ВСЕ ОБЯЗАТЕЛЬНЫЕ поля , КРОМЕ выпадающих списков
        Нажать Register
        Проверить что сообщение валидации содержит текст  , например “There are 3 errors”

*/


public class qaautoht5test {

    WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/stanislavosinskyi/Downloads/ChromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }


  /*  @Test

    public void demoTest(){
        driver.findElement(By.id("search_query_top")).
        sendKeys("Blouse");
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.className("icon-th-list")).click();
        driver.findElement(By.xpath("//*[@title='Add to cart']")).click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOfElementLocated(By.
                        xpath("//*[@title-'Proceed to checkout']"))).click();

    }

*/




    @Test
    public void verifyValidaitionMessage() {

        driver.findElement(By.xpath("//a[@class='login']")).click();


        typeEmail(By.id("email_create"), "qaauto5test768@hooli.com");


        submit(By.id("SubmitCreate"));
        // driver.findElement(By.xpath("//label[@for='id_gender']")).click();
        //WebElement createFirstNameX = driver.findElement(By.id("customer_firstname"));
        //createFirstNameX.sendKeys("Bob");
        firstName("//input[@id='customer_firstname']", "Bob");
        lastName("//input[@id='customer_lastname']", "Sancho");
        typePassword("//input[@id='passwd']", "1234567");
        typeAddress("//input[@id='address1']", "Ocean123");
        typeAnCity("//input[@id='city']", "Atlantic");

        selectStateDD();

        typeZip("//input[@id='postcode']", "54321");
        typeMobilePhone("//input[@id='phone_mobile']", "321654987");
        typeAnAddress("//input[@id='alias']", "Mars");

        driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']")).click();

/*        WebElement errorMassage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));
        Assert.assertEquals("There are 3 errors", errorMassage.getText());*/


        driver.close();




    }

    private void selectStateDD() {
        WebElement stateDropDown = driver.findElement(By.xpath("//*[@id='id_state']"));
        Select value = new Select(stateDropDown);
        value.selectByValue("5");
    }

    private void typeAnCity(String s, String atlantic) {
        WebElement createCity = driver.findElement(By.xpath(s));
        createCity.sendKeys(atlantic);
    }

    private void typeAnAddress(String s, String mars) {
        WebElement createAssignAnAddress = driver.findElement(By.xpath(s));
        createAssignAnAddress.sendKeys(mars);
    }

    private void typeMobilePhone(String s, String s2) {
        WebElement createMobilePhone = driver.findElement(By.xpath(s));
        createMobilePhone.sendKeys(s2);
    }

    private void typeZip(String s, String s2) {
        WebElement createZip = driver.findElement(By.xpath(s));
        createZip.sendKeys(s2);
    }

    private void typeAddress(String s, String ocean123) {
        WebElement createAddress = driver.findElement(By.xpath(s));
        createAddress.sendKeys(ocean123);
    }

    private void typePassword(String s, String s2) {
        WebElement createPassword = driver.findElement(By.xpath(s));
        createPassword.sendKeys(s2);
    }

    private void lastName(String s, String sancho) {
        WebElement createLastName = driver.findElement(By.xpath(s));
        createLastName.sendKeys(sancho);
    }

    private void firstName(String s, String bob) {
        WebElement createFirstName = driver.findElement(By.xpath(s));
        createFirstName.sendKeys(bob);
    }

    private void submit(By submitCreate) {
        WebElement submitCreateButton = driver.findElement(submitCreate);
        submitCreateButton.click();
    }

    private void typeEmail(By email_create, String s) {
        WebElement createEmailField = driver.findElement(email_create);
        createEmailField.sendKeys(s);
    }
    @After()
    public void close() {
        driver.close();
    }

}

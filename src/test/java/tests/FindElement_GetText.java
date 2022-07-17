package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement_GetText {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
      //  driver.manage().window().maximize();

        WebElement fullNameElement = driver.findElement(By.id("userName"));
        fullNameElement.click();
        fullNameElement.sendKeys("Hüsrev");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id = 'userEmail']"));
        email.click();
        email.sendKeys("hsrv123@gmail.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Istanbul");



        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Alanya");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();

        // -----------------------------------------------------------------------------------------

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nameText.getText();
        System.out.println(name);

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        System.out.println(emailText.getText());

        WebElement currentAddressText = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        System.out.println(currentAddressText.getText());

        WebElement permanentAddressText = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        System.out.println(permanentAddressText.getText());


        driver.quit();




    }

}

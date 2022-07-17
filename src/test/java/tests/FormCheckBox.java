package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormCheckBox {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if (isEnabled) {
            try{
                sportCheckBox.click();
            }catch(ElementClickInterceptedException ex){
                sportCheckBoxLabel.click();
                System.out.println("Entered catch block!");
            }
        }

        boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);


    }

}

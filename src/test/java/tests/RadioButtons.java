package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButtonLabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();

        if (isEnabled) {
            yesRadioButtonLabel.click();
            System.out.println("Clicked yesRadioButtonLabel");
        }

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        System.out.println(yesRadioButton.isSelected());

        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());


        WebElement output = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        System.out.println(output.getText());


        driver.quit();
    }

}

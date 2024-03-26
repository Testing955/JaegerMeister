package JagerMiesterPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage 
{
WebDriver driver;
public Basepage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
}

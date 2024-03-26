package JagerMiesterPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Superadmin extends Basepage
{
WebDriver driver;
public Superadmin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//input[@id='inputEmail1']")
WebElement txtEmail;
@FindBy(xpath="//input[@id='inputPassword']")
WebElement txtPwd;
@FindBy(xpath="//button[normalize-space()='Log in']")
WebElement btnlogin;
//@FindBy(xpath="")
//@FindBy(xpath="//a[normalize-space()='Campaign']")
WebElement btncampaign;
@FindBy(xpath="//*[@id=\"filter_event\"]/span/span[1]/span/span/textarea")
WebElement btnselectactivity;
@FindBy(xpath="//select[@id='media_type']")
WebElement drpall;
@FindBy(xpath="//select[@id='country']")
WebElement drpcountry;


public void superemailfield()
{
txtEmail.sendKeys("super@jagermaester.com");
}
public void superpasswordfield()
{
txtPwd.sendKeys("password1");
}
public void loginbutton()
{
btnlogin.click();
}
public void campaign()
{
btncampaign.click();
}
/*public void activity(String optionText) {
    Select dropdown = new Select(btnselectactivity);
    dropdown.selectByVisibleText(optionText);
}*/
public void activity()
{
btnselectactivity.sendKeys("Private parties/events/pre-drinks");
}
public void alldrop()
{
drpall.sendKeys("Stories");
}
public void country()
{
drpcountry.sendKeys("United Kingdom");
}

}

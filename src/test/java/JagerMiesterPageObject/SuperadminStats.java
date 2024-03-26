package JagerMiesterPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperadminStats extends Superadmin
{
WebDriver driver;
public SuperadminStats (WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//a[normalize-space()='Stats']")
WebElement btnstats;
@FindBy(xpath="/html/body/span/span/span/ul/li[2]")
WebElement btnactivity;
@FindBy(xpath="//option[@value='story']")
WebElement btnselect;
@FindBy(xpath="//option[@value='year']")
WebElement btnreport;
@FindBy(xpath="//button[normalize-space()='LogOut']")
WebElement btnlogout;
public void stat()
{
	btnstats.click();
}
public void activities()
{
btnactivity.sendKeys("On trade support");
}
public void select()
{
btnselect.click();
}
public void report()
{
btnreport.sendKeys("Stories");;
}
public void signout()
{
btnlogout.click();
}
}

package JaigerMeisterTestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
public WebDriver driver;
@BeforeClass
public void setup()
{
driver=new ChromeDriver();
driver.get("https://jagermaester-stag.hestawork.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
}
public String randomString()
{
String generatedstring = RandomStringUtils.randomAlphabetic(5);
return generatedstring;
}
public String randomNumber()
{
String generatedstring=RandomStringUtils.randomNumeric(10);
return generatedstring;
}
public String randomAlphaNumberic()
{
String str = RandomStringUtils.randomAlphabetic(5);
String numberic=RandomStringUtils.randomNumeric(5);
return (str +"@"+numberic);
}


}

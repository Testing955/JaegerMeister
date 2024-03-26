package JaigerMeisterTestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase 
{
public WebDriver driver;
public Logger logger;
@BeforeClass
@Parameters({"os","browser"})
public void setup(String os, String br)
{
//Loading log4j2file
logger = LogManager.getLogger(this.getClass());
switch(br.toLowerCase())
{
case "chrome":driver=new ChromeDriver();break;
case "safari":driver = new SafariDriver();break;
default: System.out.println("No matching browser.....");
return;
}

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

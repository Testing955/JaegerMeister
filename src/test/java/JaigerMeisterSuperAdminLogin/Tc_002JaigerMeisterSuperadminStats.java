package JaigerMeisterSuperAdminLogin;

import org.testng.Assert;
import org.testng.annotations.Test;

import JagerMiesterPageObject.SuperadminStats;
import JaigerMeisterTestBase.TestBase;

public class Tc_002JaigerMeisterSuperadminStats extends TestBase
{
@Test
public void Statsoption()
{
try
{
SuperadminStats ss = new SuperadminStats(driver);
ss.superemailfield();
ss.superpasswordfield();
ss.loginbutton();
Thread.sleep(5000);
ss.stat();

Thread.sleep(10000);
ss.activities();
ss.select();
ss.report();
Thread.sleep(5000);
ss.signout();
}
catch(Exception e)
{
Assert.fail();
}
}
}

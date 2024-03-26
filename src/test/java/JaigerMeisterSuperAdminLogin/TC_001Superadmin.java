package JaigerMeisterSuperAdminLogin;

import org.testng.annotations.Test;

import JagerMiesterPageObject.Superadmin;
import JaigerMeisterTestBase.TestBase;

public class TC_001Superadmin extends TestBase
{
@Test
public void verify_superadminlogin()
{
try
{
Superadmin sa=new Superadmin(driver);

sa.superemailfield();
sa.superpasswordfield();
sa.loginbutton();
sa.campaign();
sa.activity();
sa.alldrop();
sa.country();

//String confmsg=sa.getConfirmationMsg();
}
catch(Exception e)
{

}
}
}

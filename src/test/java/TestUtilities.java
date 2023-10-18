import Screens.BaseUtilities;
import Screens.LoginScreen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestUtilities{

    @BeforeSuite
    public void start() throws MalformedURLException {
        BaseUtilities.setUp();
    }

    @AfterTest
    public void tearDown()
    {
        BaseUtilities.quitTabs();
                //base=new BaseUtilities();
    }
}

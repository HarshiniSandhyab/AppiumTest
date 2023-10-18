import Screens.BaseUtilities;
import Screens.LoginScreen;
import Screens.ProductScreen;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import static Screens.BaseUtilities.filePath;

public class ProductTest extends TestUtilities
{
    @Test
   public void menubars() throws FileNotFoundException, InterruptedException {
        LoginScreen screen1=new LoginScreen();
        screen1.login(filePath);

        ProductScreen screen2=new ProductScreen();
        screen2.logoutapp();


    }

    }


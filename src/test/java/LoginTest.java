import Screens.LoginScreen;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import static Screens.BaseUtilities.filePath;

public class LoginTest extends TestUtilities{

    LoginScreen loginScreen = new LoginScreen();


    @Test
    public void sampleTest() throws FileNotFoundException, InterruptedException {
        loginScreen.login(filePath);
    }
}


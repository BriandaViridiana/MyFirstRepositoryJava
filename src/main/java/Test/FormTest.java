package Test;
import org.openqa.selenium.chrome.ChromeDriver;
import Steps.FormSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Utilities.Utils;

public class FormTest {


 public ChromeDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setting() {

        System.setProperty("webdriver.chrome.driver", Utils.UtilsDriver.CHOME_DRIVER_LOCATION);
         driver.get(Utils.UtilsDriver.BASE_URL);

    }


    @Test
    public void submiForm() {

        FormSteps actions = new FormSteps(driver);
        actions.enterFirstName();
        actions.click_Highest_level_of_education();

}

@AfterSuite
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();

}

}

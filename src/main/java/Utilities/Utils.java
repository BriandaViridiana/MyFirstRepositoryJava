package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {

    public WebDriver driver;

    protected WebDriver webElement;

    public Utils(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static class UtilsDriver{

        public static String BASE_URL="https://formy-project.herokuapp.com/form";

        public static String CHOME_DRIVER_LOCATION = "chromedriver";

    }


}

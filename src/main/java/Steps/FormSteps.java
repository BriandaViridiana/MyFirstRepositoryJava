package Steps;


import Page.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSteps extends HomePage {

    public  FormSteps(ChromeDriver driver) {super(driver);}

    public void enterFirstName () {
        String FIRST_NAME = "Brianda";
        this.first_name.sendKeys(FIRST_NAME);
    }

        public void click_Highest_level_of_education () {
            this.college.click();


        }


    }


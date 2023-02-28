package Steps;


import org.openqa.selenium.WebElement;
import Page.HomePage;
import org.openqa.selenium.support.FindBy;

public class FormSteps extends HomePage {

    private WebElement first_name;

    public void enterFirstName () {
        String FIRST_NAME = "Brianda";
        this.first_name.sendKeys(FIRST_NAME);
    }

        public void click_Highest_level_of_education () {
            this.college.click();


        }


    }


package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    protected ChromeDriver driver;

    public HomePage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

  //  @FindBy(xpath = "user" )

    @FindBy(id = "first-name" )
    public WebElement first_name;


    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement college;


}

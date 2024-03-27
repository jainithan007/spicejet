package Page;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecifications;
import Utilies.Utilities;

public class LoginPage extends ProjectSpecifications {
	
	Utilities action = new Utilities();
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement mobilenumber;

    @FindBy(xpath = "(//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//div[@data-focusable='true'])[43]")
    public WebElement loginButton;
    
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
		this.driver=driver;
    }

    public void login(String mobileNo, String password) throws InterruptedException{
    	
    	new Actions(driver).click(mobilenumber).sendKeys(mobileNo+Keys.TAB).sendKeys(password+Keys.ENTER).perform();
    	Thread.sleep(1000);
    	action.click(loginButton);
    }

}

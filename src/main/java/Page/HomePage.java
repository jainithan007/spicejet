package Page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilies.Utilities;

public class HomePage extends Utilities {

    @FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar']")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[@dir='auto'])[48]")
    public  WebElement signUpButton;

    public HomePage(WebDriver driver) {
    	
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


	public LoginPage clickLoginButton(){
        click(loginButton);
        return new LoginPage(driver);
    }


	public SignUpPage clickSignUpBtn(){
        click(signUpButton);
        return new SignUpPage(driver);

    }
}

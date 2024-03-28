package Test;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import Page.HomePage;
import Page.SignUpPage;


public class TC_001_Signin extends ProjectSpecifications{
	
	HomePage homePage;
	SignUpPage signUpPage;	
	
	@BeforeTest
	public void setup() {
		excelFile = "Sheet";
		excelSheet = 0;
	}
	
	
	@Test(dataProvider = "readExcel")
	public void SignUpTest(String fName,String lName, String DOB, String Number,String email, String password, 
			String ConfirmPassword) throws InterruptedException, AWTException {

		homePage = new HomePage(driver);
		click(homePage.signUpButton);
		Thread.sleep(5000);
		switchWindows("https://spiceclub.spicejet.com/signup");
		
		signUpPage= new SignUpPage(driver);
		signUpPage.signUp(fName, lName, DOB, Number, email, password, ConfirmPassword);
		
		

	}
}

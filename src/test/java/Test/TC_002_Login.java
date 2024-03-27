package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecifications;
import Page.HomePage;
import Page.LoginPage;
import Utilies.Utilities;





public class TC_002_Login extends ProjectSpecifications{
	HomePage homePage;
	LoginPage loginPage;
//	Utilities utility= new Utilities();
	
	@BeforeTest
	public void setup() {
		excelFile = "";
		excelSheet = 0;
	}
	
	
	
	@Test(dataProvider = "readExcel")
	public void SignUpTest(String mobileNumber, String Password) throws InterruptedException {
		
		homePage = new HomePage(driver);
		click(homePage.loginButton);
		Thread.sleep(3000);
		switchWindows("https://spiceclub.spicejet.com/");
		Thread.sleep(3000);
		loginPage= new LoginPage(driver);
		
		loginPage.login(mobileNumber, Password);
	}

}

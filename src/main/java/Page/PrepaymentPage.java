package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecifications;

public class PrepaymentPage extends ProjectSpecifications{
	
	@FindBy(xpath = "//input[@placeholder='Enter Card Number Here']")
	public WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id='name_on_card']")
	public WebElement cardHolderName;
	
	@FindBy(xpath = "//input[@id='card_exp_month']")
	public WebElement expMonth;
	
	@FindBy(xpath = "//input[@id='card_exp_year']")
	public WebElement cardExpYear;
	
	@FindBy(xpath = "//input[@id='security_code']")
	public WebElement cardCvv;
	
	@FindBy(xpath = "//div[@data-testid='common-proceed-to-pay']")
	public WebElement paymentButton;
	
	public PrepaymentPage(WebDriver name) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void cardDetails(String cardNo, String name, String month, String year, String cvv) {

		try {


			driver.switchTo().frame(cardNumber);
			System.out.println("switched to frame");
			cardNumber.click();
			sendkeys(cardNumber, cardNo);

			driver.switchTo().frame(2);
			cardHolderName.click();
			sendkeys(cardHolderName, name);

			driver.switchTo().frame(3);
			expMonth.click();
			sendkeys(expMonth, month);

			driver.switchTo().frame(4);
			cardExpYear.click();
			sendkeys(cardExpYear, year);

			driver.switchTo().frame(5);
			cardCvv.click();
			sendkeys(cardCvv, cvv);

			driver.switchTo().defaultContent();

			click(paymentButton);

		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	// xxxxxxxxxxxxxxxxxxxxxxxxxx OBJECTS xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	@FindBy(linkText="Log in")
	WebElement Loginlink;
	
	@FindBy(name="user_login")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Checkbox;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	public LoginPage( WebDriver basedriver) {
		
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);
	} 
	//xxxxxxxxxxxxxxxxxxxxxxx METHODS xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
	
	public void Login(String UsernameVal,String password) {
			// click on Login button	
		Loginlink.click();
		
		// enter username
		Username.sendKeys(UsernameVal);
		
	 // enter password
		Password.sendKeys(password);
		
		// remember me
		Checkbox.click();
		
		//enter Login
		LoginBtn.click();
	}

}

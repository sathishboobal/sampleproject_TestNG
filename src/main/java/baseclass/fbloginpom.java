package baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginpom extends baseclass {
	public fbloginpom() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="email")
	private WebElement Email;
	@FindBy(name="pass")
	private WebElement password;
	
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return password;
	}
	
	
	
}

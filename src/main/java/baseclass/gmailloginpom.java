package baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class gmailloginpom extends baseclass {
	public gmailloginpom() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="identifierId")
	private WebElement mailid;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement click;
	public WebElement getMailid() {
		return mailid;
	}
	public WebElement getClick() {
		return click;
	}
	

}

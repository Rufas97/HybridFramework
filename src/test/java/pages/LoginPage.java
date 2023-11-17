package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	//WebElement element1=Driver.findElements(By.xpath(""));
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement registratonLink;
	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
		test.info("entered text "+text+" into textbox");
	}
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
		test.info("entered text "+text+" into textbox");
	}
	public void loginButton()
	{
		loginButton.click();
		test.info("Clicked login button ");
	}
	public void registratonLink()
	{
		registratonLink.click();
		test.info("Clicked registration button ");
	}
}

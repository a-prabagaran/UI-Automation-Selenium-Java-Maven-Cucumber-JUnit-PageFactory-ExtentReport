package automationPracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationPracticeUtil.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id = "email")
	WebElement emailaddress;

	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(id = "SubmitLogin")
	WebElement SignInBtn;

	@FindBy(xpath = "//a[@class='login']")
	WebElement SignInLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public AppPage login(String em, String pwd) {
		SignInLink.click();
		emailaddress.sendKeys(em);
		password.sendKeys(pwd);
		SignInBtn.click();

		return new AppPage();

	}

}

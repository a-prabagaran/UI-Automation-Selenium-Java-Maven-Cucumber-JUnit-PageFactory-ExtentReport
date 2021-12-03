package automationPracticePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationPracticeUtil.TestBase;

public class AppPage extends TestBase{

	@FindBy(xpath = "//div[@id='block_top_menu']//li[3]//a[text()='T-shirts']")
	WebElement TShirtsLink;

	@FindBy(xpath = "//a[@title='View my customer account']//span")
	WebElement UNameLabel;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement TShirtImg;

	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement AddToCartBtn;

	@FindBy(xpath = "//a[@title='Proceed to checkout']//span")
	WebElement ProceedToCheckoutBtn;

	@FindBy(xpath = "//a[@title='Continue shopping']/..//span")
	WebElement ProceedToCheckoutBtnn;

	@FindBy(xpath = "//button[@name='processAddress']//span")
	WebElement ProceedToCheckoutBtnnn;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement CheckBox;

	@FindBy(xpath = "//button[@name='processCarrier']//span")
	WebElement ProceedToCheckoutBtnnnn;

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	WebElement PayByBankWire;

	@FindBy(xpath = "//span[text()='I confirm my order']")
	WebElement IConfirmMyOrder;

	@FindBy(xpath = "//a[@title='Back to orders']")
	WebElement BackToOrders;

	@FindBy(xpath = "//tbody//tr[@class='first_item ']")
	WebElement OrderHistoryItem;

	@FindBy(xpath = "//span[text()='My personal information']")
	WebElement MyPersInfoBtn;

	@FindBy(id = "firstname")
	WebElement firstName;

	@FindBy(id = "old_passwd")
	WebElement CurrentPwd;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement saveBtn;

	public AppPage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickTShirtsLink() {
		TShirtsLink.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(TShirtImg).perform();
		AddToCartBtn.click();
		ProceedToCheckoutBtn.click();
		ProceedToCheckoutBtnn.click();
		ProceedToCheckoutBtnnn.click();
		CheckBox.click();
		ProceedToCheckoutBtnnnn.click();
		PayByBankWire.click();
		IConfirmMyOrder.click();
		BackToOrders.click();
	}

	public boolean verifyOrderHistory() {
		return OrderHistoryItem.isDisplayed();
	}

	public void MyPersonalInfo(String fn, String pwd) {
		MyPersInfoBtn.click();
		firstName.clear();
		firstName.sendKeys(fn);
		CurrentPwd.sendKeys(pwd);
		saveBtn.click();
	}

	public String GetUserName() {
		return UNameLabel.getText();
	} 
}

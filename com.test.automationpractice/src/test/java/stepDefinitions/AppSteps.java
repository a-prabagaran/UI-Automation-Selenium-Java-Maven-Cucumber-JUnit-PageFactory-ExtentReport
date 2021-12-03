package stepDefinitions;

import org.junit.Assert;

import automationPracticePages.AppPage;
import automationPracticePages.LoginPage;
import automationPracticeUtil.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class AppSteps extends TestBase {

	LoginPage loginpage;
	AppPage apppage;

	@Given("launch the browser")
	public void launch_browser() {
		TestBase.open_browser();
	}

	@When("login with valid credentials")
	public void login() {
		loginpage = new LoginPage();
		apppage = loginpage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));
	}

	@Then("order T-Shirt")
	public void order_TShirts() {
		apppage.ClickTShirtsLink();
	}

	@And("verify the T-Shirt ordered in order history")
	public void verify_ordered_TShirt() {
		boolean flag = apppage.verifyOrderHistory();
		Assert.assertTrue(flag);
	}

	@Then("update First Name")
	public void update_firstname() {
		apppage.MyPersonalInfo(prop.getProperty("firstname"), prop.getProperty("password"));
	}

	@And("verify the updated First Name")
	public void verify_updated_firstname() {
		String UsrName = apppage.GetUserName();
		assertThat(UsrName, containsString(prop.getProperty("firstname")));
	}
	
	@After
	public void tear_down()
	{
		TestBase.close_browser();
	}
	

}

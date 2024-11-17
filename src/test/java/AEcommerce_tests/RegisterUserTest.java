package AEcommerce_tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AEcommerce.TestsComponents.BaseTest;
import AEcommerce_pageobjects.LoginPage;
import AEcommerce_pageobjects.SignupPage;

public class RegisterUserTest extends BaseTest {
	
	@Test(dataProvider="getData")
	public void registerUser (HashMap<String,Object> input)
	{
		
		LoginPage loginPage = 	landingPage.signUpLoginTab();
		SignupPage signupPage = loginPage.registerUser((String)input.get("uName"),(String) input.get("uEmail"));
		Assert.assertTrue(signupPage.isAccountInfoLabelDisplayed());
		signupPage.addAccountDetails((String)input.get("password"));
		signupPage.enterAddressInformation((String)input.get("firstName"),(String)input.get("lastName"),(String)input.get("company"),(String)input.get("address1"),(String)input.get("country"),(String)input.get("state"),(String)input.get("city"),(String)input.get("zipCode"),(String)input.get("mobileNo"));
		signupPage.createAccount();
		Assert.assertTrue(signupPage.isAccountCreatedVisible());
		signupPage.clickContinue();
		Assert.assertEquals(landingPage.userLogIn(),(String)input.get("userName"));
		landingPage.deleteAccount();
		landingPage.clickContinueBtn();
		
		
	}
	
	@DataProvider()
	public Object[][] getData() throws IOException
	{
		List<HashMap<String,Object>> data =	getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\AEcommerce\\data\\RegisterUser.json");
		return new Object[][] {{data.get(0)}};
	}

}
//Register user for First Time
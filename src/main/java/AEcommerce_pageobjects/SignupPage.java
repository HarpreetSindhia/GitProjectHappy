package AEcommerce_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends AbstractComponents {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//WebElement accountInfo =	driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
	
	@FindBy(xpath="//b[text()='Enter Account Information']")
	WebElement accountInfo;
	
	public boolean isAccountInfoLabelDisplayed()
	{
		return accountInfo.isDisplayed();
	}
	
	//driver.findElement(By.xpath("//input[@value='Mr']")).click();
	
	@FindBy(xpath="//input[@value='Mr']")
	WebElement title;
	
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sindhiaAnueng55");
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='optin']")
	WebElement checkBox1;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement days;
	
	@FindBy(xpath="//select[@name='months']")
	WebElement months;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement years;

	
	
	public void addAccountDetails(String password)
	{
		title.click();
		this.password.sendKeys(password);
		Select dayDropDown = new Select(days);
		dayDropDown.selectByVisibleText("11");
		waitForTheWebElementToBeVisible(months);
		Select monthDropDown = new Select(months);
		monthDropDown.selectByVisibleText("February");
		waitForTheWebElementToBeVisible(years);
		Select yearDropDown = new Select(years);
		yearDropDown.selectByVisibleText("2010");
		scrollIntoView(checkBox);
		waitForTheWebElementToBeClickable(checkBox);
		elementToBeClickable(checkBox);
		waitForTheWebElementToBeClickable(checkBox1);
		checkBox1.click();
		
		
	}
	
	
	
	//Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='days']")));
	//dropDown.selectByVisibleText("2");
	
	//Select dropDown1 = new Select(driver.findElement(By.xpath("//select[@id='months']")));
	//dropDown1.selectByVisibleText("September");
	
	//Select dropDown2 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
	//dropDown2.selectByVisibleText("2012");
	
	//String day =	dropDown.getFirstSelectedOption().getText();
	//Assert.assertEquals(day, "2");
	//Select dropDown1 = new Select(driver.findElement(By.xpath("//select[@id='months']")));
	//dropDown1.selectByVisibleText("September");
	//String month =	dropDown1.getFirstSelectedOption().getText();
	//Assert.assertEquals(month, "September");
	//Select dropDown2 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
	//dropDown2.selectByVisibleText("2012");
	//String year =	dropDown2.getFirstSelectedOption().getText();
	//Assert.assertEquals(year, "2012");
	
	//WebElement checkBox =	driver.findElement(By.xpath("//input[@id='newsletter']"));
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement checkBox;
	
	
	/*js.executeScript("arguments[0].scrollIntoView(true);", checkBox);
	wait.until(ExpectedConditions.elementToBeClickable(checkBox));
	js.executeScript("arguments[0].click();", checkBox);
	//checkBox.click();
	WebElement checkBox1 =	driver.findElement(By.xpath("//input[@id='optin']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkBox1));
	checkBox1.click();*/
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement address1;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement dropDownCountry;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement mobileNo;
	
	public void enterAddressInformation(String firstName , String lastName ,  String company , String address1 , String country , String state ,
			String city, String zipCode , String mobileNo)
	{
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.company.sendKeys(company);
		this.address1.sendKeys(address1);
		Select dropDown_Country = new Select(dropDownCountry);
		dropDown_Country.selectByVisibleText(country);
		this.state.sendKeys(state);
		this.city.sendKeys(city);
		this.zipCode.sendKeys(zipCode);
		this.mobileNo.sendKeys(mobileNo);
	}
	
	
	//driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Anaahadbir");
	//driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Sindhia");
	//driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Tesla");
	//driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("223, Kingfisher Avenue");
	//driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("TownsVile , Brisbane");
	//DropDown select Country
	//Select dropDown4 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
	/*dropDown4.selectByVisibleText("Australia");
	String countrySelect =	dropDown4.getFirstSelectedOption().getText();
	Assert.assertEquals(countrySelect, "Australia");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Florida");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Brisbane");
	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("7894003");
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9875495822");*/
	
	
	@FindBy(xpath="//button[@data-qa='create-account']")
	WebElement createAccount;
	
	public void createAccount()
	{
		scrollIntoView(createAccount);
		waitForTheWebElementToBeClickable(createAccount);
		createAccount.click();
	}
	/*WebElement createAccount =	driver.findElement(By.xpath("//button[@data-qa='create-account']"));
	js.executeScript("arguments[0].scrollIntoView(true);", createAccount);
	wait.until(ExpectedConditions.elementToBeClickable(createAccount));
	createAccount.click();*/
	
	//WebElement accCreate =	driver.findElement(By.xpath("//b"));
	
	@FindBy(xpath="//b")
	WebElement accCreate;
	
	//driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	
	@FindBy(xpath="//a[@data-qa='continue-button']")
	WebElement continueBtn;
	
	public boolean isAccountCreatedVisible()
	{
		return accCreate.isDisplayed();
		
	}
	
	public void clickContinue()
	{
		continueBtn.click();
	}
	
}

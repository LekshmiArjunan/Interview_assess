package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Actionss;

public class SignUpPage {

		public WebDriver driver;
		public Actionss act;
		
		public  SignUpPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
			
			
		}
	//login
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[3]/div/div/div/button[2]")
		public WebElement SignUpButton;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[1]/div/div/div/input")
		public WebElement EmailID;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[2]/div[1]/div/div/input")
		public WebElement FirstName;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[2]/div[2]/div/div/input")
		public WebElement LastName;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[3]/div/div/div/input")
		public WebElement Password;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[4]/div/div/div/svg")
		public WebElement ConfirmPassword;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div/div[2]/div[4]/form/div/div/div[5]/button/span[1]")
		public WebElement ContinueButton;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[1]/div/div/div/input")
		public WebElement CompanyName;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div/input")
		public WebElement CompanyAddress;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/div[1]/div/input")
		public WebElement Country;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[4]/div/div[1]/div/input")
		public WebElement Province;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[5]/div/div[1]/div/input")
		public WebElement City;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[1]/div[6]/div/div/div/input")
		public WebElement PostalCode;
		
		@FindBy(xpath = "//*[@id=\"mui-component-select-firmTypeId\"]")
		public WebElement OrganisationType;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/button[2]")
		public WebElement NextButton;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[4]/div/div/p")
		public WebElement Role;
		
		@FindBy(xpath = "//*[@id=\"root\"]/div[20]/div/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/button[2]")
		public WebElement SignUpButton2;
			
		
		public String getEmailID(String e) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String email = act.sendkeys(log.EmailID, e);
			return email;
		}

		public String getFirstName(String f) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String FName = act.sendkeys(log.FirstName, f);
			return FName;
		}
		
		public String getLastName(String l) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String LName = act.sendkeys(LastName, l);
			return LName;
		}
		
		
		public String getPassword(String p) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String Password = act.sendkeys(log.Password, p);
			return Password;
		}
		public String getConfirmPwd(String cp) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String cpwd = act.sendkeys(log.ConfirmPassword, cp);
			return cpwd;
		}
		public String getCompanyName(String cn) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String CompanyName = act.sendkeys(log.CompanyName, cn);
			return CompanyName;
		}
		public String getAddress(String ad) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String CompanyAddress = act.sendkeys(log.CompanyAddress, ad);
			return CompanyAddress;
		}
		
		public String getPostalCode(String pc) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String PostalCode = act.sendkeys(log.PostalCode, pc);
			return PostalCode;
		}
		

		public int getCountry(int con) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			int Country = act.dropDown(log.Country, con);
			return Country;
		}
		

		public int getProvince(int pro) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			int Province = act.dropDown(log.Province, pro);
			return Province;
		}
		
		public String getCity(String cit) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String Ci = act.dropDown2(City, cit);
			return Ci;
		}
		
		public String getOrgType(String ot) throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
			String OrgType = act.dropDown2(OrganisationType, ot);
	
			return OrgType;
		}
		
		public void getRole() throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
		    act.click(Role);
		}
		
		public void getSignup() throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
		    act.click(SignUpButton);
		}
		
		public void getContinue() throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
		    act.click(ContinueButton);
		}
		public void getNext() throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
		    act.click(NextButton);
		}
		public void getSignup2() throws InterruptedException
		{
			Actionss act = new Actionss(driver);
			SignUpPage log = new SignUpPage(driver);
		    act.click(SignUpButton2);
		}
		
	}

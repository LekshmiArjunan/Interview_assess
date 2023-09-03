package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodel.SignUpPage;
import constant.Constants;

import utility.Actionss;
import utility.LaunchBrowser;
import utility.ReadConfigProperties;

public class Signuppagetest extends LaunchBrowser {	
		public static WebDriver driver;
		ReadConfigProperties readdataprop = new ReadConfigProperties();
		SignUpPage log;
		Actionss act;
			
		@DataProvider(name="dp")
		  public Object[][] datasets() {
		    return new Object[][] {
		    	 new Object[] { "lekshmi.gmail.com" , "" },
		    	 new Object[] { " ", " " },
		    	 new Object[] { "lekshmiaarjun@gmail.com", "Lekshmi"}
		    };
		}

		
	  @Test(priority = 0 , enabled = true)
	  public void Tc_signupid(  String e) throws InterruptedException {
//		  this.driver = super.driver;
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
			
			
			log.getSignup();
			String emailid = log.getEmailID(e);
			String expectedid = Constants.expected_email;
			Thread.sleep(1000);
			Assert.assertEquals(emailid,expectedid,Constants.TEXTERROR);
			Thread.sleep(1000);
			  
	}
//		  
	  @Test(priority =  1, enabled = true, dataProvider = "dp")
	  public void Tc_negscene(  String e, String f) throws InterruptedException {
//		  this.driver = super.driver;
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
			
			driver.navigate().refresh();
			log.getSignup();
			String emailid = log.getEmailID(e);
			Thread.sleep(1000);
			String firstname = log.getFirstName(f);
			
			String expectedid = Constants.expected_email;
			Assert.assertEquals(emailid,expectedid,Constants.TEXTERROR);
			String expected1name = Constants.expected_firstname;
			Assert.assertEquals(firstname,expected1name,Constants.TEXTERROR);
			Thread.sleep(1000);
			
	}	  
	  
	  @Test(priority = 2 , enabled = true)
	  public void Tc_firstname(String f) throws InterruptedException {
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  
		  String firstname = log.getFirstName(f);
		  String expected1name = Constants.expected_firstname;
		  Assert.assertEquals(firstname,expected1name,Constants.TEXTERROR);
		  Thread.sleep(1000);
		  
	  }
	  
	  
	  
	  
	  
	  @Test(priority = 3, enabled = true)
		public void Tc_lastname(String l) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  
		  String lastname = log.getLastName(l);
		  String expectedlastname = Constants.expected_lastname;
		  Assert.assertEquals(lastname,expectedlastname,Constants.TEXTERROR);
	  }

	  @Test(priority = 4, enabled = true)
		public void Tc_passwrd(String p) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String password = log.getPassword(p);
		 
		  String expectedpwd = Constants.expected_password;
		  Assert.assertEquals(password,expectedpwd,Constants.TEXTERROR);
	  }
	  
	  
	  @Test(priority = 5, enabled = true)
		public void Tc_confmpasswrd(String cp) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String confpass = log.getConfirmPwd(cp);
		  log.getContinue();
		  String expectedconfmpwd = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(confpass,expectedconfmpwd,Constants.TEXTERROR);
	  }
	  
	  @Test(priority = 6, enabled = true)
		public void Tc_companyname(String cn) throws InterruptedException {
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String compnamee = log.getCompanyName(cn);
		  String expectedconname = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(compnamee,expectedconname,Constants.TEXTERROR);
	  }
	  
	  
	  @Test(priority = 7, enabled = true)
		public void Tc_companyaddress(String ad) throws InterruptedException {
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String compaddres = log.getAddress(ad);
		  String expectedconadd = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(compaddres,expectedconadd,Constants.TEXTERROR);
	  }
	  
	  
	  
	  @Test(priority = 8, enabled = true)
		public void Tc_country(String con) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  log.getCountry(1);
		  String contry = log.Country.getText();
		  String expectedconty = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(contry,expectedconty,Constants.TEXTERROR);
	  }
	  @Test(priority = 9, enabled = true)
		public void Tc_province(String pro) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  log.getProvince(8);
		  String provincee = log.Province.getText();
		  String expectedprov = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(provincee,expectedprov,Constants.TEXTERROR);
	  }
	  
	  
	  @Test(priority = 10, enabled = true)
		public void Tc_city(String cit) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String cityy = log.getCity(cit);
		  String expectedcity = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(cityy,expectedcity,Constants.TEXTERROR);
	  }
	  
	  @Test(priority = 11, enabled = true)
		public void Tc_postalcode(String pc) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String postal = log.getPostalCode(pc);
		  String expectedpostal = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(postal,expectedpostal,Constants.TEXTERROR);
	  }
	  
	  
	  @Test(priority = 12, enabled = true)
		public void Tc_organizatn(String ot) throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  String org = log.getAddress(ot);
		  log.getNext();
		  String expectedorg = Constants.expected_confirmpasswrd;
		  Assert.assertEquals(org,expectedorg,Constants.TEXTERROR);
	  }
	  
	  
	  @Test(priority = 13, enabled = true)
		public void Tc_role() throws InterruptedException {
		
		  readdataprop = new ReadConfigProperties();
		  SignUpPage log = new SignUpPage(driver);
		  boolean rolee = act.isElementSelected(log.Role);
		  boolean expectedrolee = true;
		  log.getSignup2();
		  Assert.assertEquals(rolee, expectedrolee , Constants.TEXTERROR);
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
//	  @BeforeTest
//	  public void beforeTest() throws Exception {
//		  launchingBrowser( readdataprop.geturl(),  readdataprop.getbrowser());
//		  this.driver= super.driver;
//	}
//
//	  @AfterTest
//	  public void afterTest() {
//		  closeBrowser();
//		  this.driver= super.driver;
//	  }

}

//}

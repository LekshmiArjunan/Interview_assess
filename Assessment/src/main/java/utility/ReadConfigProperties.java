package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
public class ReadConfigProperties {
	
Properties pro;
	
	public ReadConfigProperties() 
	{
		File src=new File("C:\\Users\\RJ\\eclipse-workspace newwww\\Assessment\\src\\test\\resources\\config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String geturl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	 
	public String getEmailID()
	{
		String eid=pro.getProperty("EmailID");
		return eid;
	}
	
	public String getFirstName()
	{
		String FName=pro.getProperty("FirstName");
		return FName;
	}
	

	public String getLastName()
	{
		String LName=pro.getProperty("LastName");
		return LName;
	}
	

	public String getPassword()
	{
		String pwd=pro.getProperty("Password");
		return pwd;
	}
	

	public String getConfirmPassword()
	{
		String cpwd=pro.getProperty("ConfirmPassword");
		return cpwd;
	}
	

	public String getCompanyName()
	{
		String cname=pro.getProperty("CompanyName");
		return cname;
	}
	

	public String getCompanyAddress()
	{
		String caddress=pro.getProperty("CompanyAddress");
		return caddress;
	}
	

	public String getPostalCode()
	{
		String code=pro.getProperty("PostalCode");
		return code;
	}
	

	public String getCity()
	{
		String cit=pro.getProperty("City");
		return cit;
	}
	

	public String getOrganisationType()
	{
		String otype=pro.getProperty("OrganisationType");
		return otype;
	}
	

	public String getbrowser()
	{
		String browser=pro.getProperty("browser");
		return browser;
	}
	
}

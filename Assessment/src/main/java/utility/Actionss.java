package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionss {
	
	public WebDriver driver;
	
	public Actionss(WebDriver driver) {
		this.driver = driver;
	}

	//sendkeys
	public String sendkeys(WebElement element, String text) throws InterruptedException {
		Actions sendkeyo =new Actions(driver);
		sendkeyo.click(element).sendKeys(text).build().perform();
		return text;
	}

//click
	public void click(WebElement element) throws InterruptedException {
		Actions clicko =new Actions(driver);
		clicko.click(element).build().perform();
		
	}
//Alertccept
		public void alertaccept() throws InterruptedException {
		 Alert objalert = driver.switchTo().alert();
			objalert.accept();
		}
//Alert dismiss
		public void alertdismiss() throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			objalert.dismiss();
		}
//Alert sendtext
		public void alertsendtext(String value) throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			objalert.sendKeys(value);
		}

//Alert gettext
		public String alerttextmsg() throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			return objalert.getText(); 
		}
//dropdown
		public int dropDown(WebElement element,int a) throws InterruptedException  {			
			Select Dropcolour = new Select(element);
            //Dropcolour.selectByValue(a);
//			Thread.sleep(2000);
//			Dropcolour.selectByVisibleText(a);
//			Thread.sleep(2000);
			Dropcolour.selectByIndex(a);
			Thread.sleep(2000);
//			List<WebElement>listOfElements=Dropcolour.getOptions(); 
//			return listOfElements.size();
			return a;
			 
		}
		public String dropDown2(WebElement element,String a) throws InterruptedException  {			
			Select Dropcolour = new Select(element);
            Dropcolour.selectByValue(a);
//			Thread.sleep(2000);
//			Dropcolour.selectByVisibleText(a);
//			Thread.sleep(2000);
			//Dropcolour.selectByIndex(z);
			Thread.sleep(2000);
//			List<WebElement>listOfElements=Dropcolour.getOptions(); 
//			return listOfElements.size();
			return a;
			 
		}
		
		
		public void dropDownde(WebElement element) throws InterruptedException {
			Select Dropcolour = new Select(element);
			Dropcolour.deselectAll();
			Thread.sleep(2000);
		}
// displayed
		public boolean isAlertDisplayed(WebElement element) {
			return element.isDisplayed();
	 	}
		
		
		public boolean isEnabled(WebElement element) {
			return element.isEnabled();
		}
		
		public String getPageTitle(WebDriver driver) {
			return driver.getTitle();
		}
		
		public boolean isElementDisplayed(WebElement element) {
			return element.isDisplayed();
		}
		
		public boolean isElementSelected(WebElement element) {
			return element.isSelected();
		}
}

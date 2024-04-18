package Page;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;


public class PropertyPage {
		WebDriver driver;
		
//@Post--------------------------------------------------------------------------------------------------------
	@FindBy(xpath="//button[@class=\"btn btn-default btn-sm\"]")
	WebElement fpo;
		
	@FindBy(xpath="(//button[@data-garden-id=\"buttons.icon_button\"])[2]")	
	WebElement frameeeee;
		
    @FindBy(xpath="//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"]")
    WebElement city;
    
    @FindBy(xpath="//div[text()=\"Mumbai\"]")
    WebElement mumbai;
    @FindBy(xpath="//button[@class=\"btn btn-primary btn-lg btn-block\"]")
    WebElement posting;
		
	@FindBy(xpath="//label[@class=\"nb-switch\"]//child::input")
	WebElement onActive;
	
	@FindBy(xpath="//button[text()=\"Post Now\"]")
	WebElement post;
	
	@FindBy(xpath="//div[@class=\"pyp-form-header-container\"]")
	WebElement propertyDetails;
	
	
	@FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
	WebElement v;
	
	@FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[2]")
	WebElement  bhk;
	 
	@FindBy(xpath="(//button[@class=\"StyledButton-sc-qe3ace-0 styles__StyledIconButton-sc-15a7l1o-0 jQVhMx StyledIconButton-sc-1t0ughp-0 stzzW\"])[2]")
	WebElement minimize;
	
	@FindBy(xpath="//button[text()=\"Yes\"]")
	WebElement yes;

	@FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[3]")
	WebElement floor;
	
	@FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[4]")
	WebElement totalf;

   @FindBy(xpath="(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[5]")
	WebElement propertyAge;
   

   @FindBy(id="propertySize")
   WebElement BA;
   
   @FindBy(xpath="//button[@class=\"btn btn-primary\"]")
   WebElement sc;

	@FindBy(xpath="//div[text()=\"Independent House/Villa\"]")
	@CacheLookup
	WebElement selectType;
	
	@FindBy(xpath="//div[text()=\"4 BHK\"]")
	@CacheLookup
	WebElement selectBhk;
	
	@FindBy(xpath="//div[text()=\"2\"]")
	@CacheLookup
	WebElement selectf;
	
	@FindBy(xpath="//div[text()=\"4\"]")
	@CacheLookup
	WebElement selectTf;
	
	@FindBy(xpath="//div[text()=\"1 to 3 year\"]")
	@CacheLookup
	WebElement selectPA;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary\"]")
	WebElement saveNcontinue;
	
	@FindBy(xpath="(//div[@class=\"nb__3RXL4\"])[2]")
	WebElement locality;
	
	public PropertyPage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
	}

	public void click() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(fpo));
		  Thread.sleep(1000);
		   fpo.click();
	  }
	
	public void Switch() {
	
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		 if (!handle.equals(mainWindowHandle)) {
		 driver.switchTo().window(handle);
		 }
		}
	}
	public void onlyActive() throws InterruptedException {
		Actions actions=new Actions(driver);
    actions.click(onActive).perform();

	 Thread.sleep(1000);

	}
		
   public void postNow() throws InterruptedException {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scroll(0,100)");
		    
		    Thread.sleep(2000);
	 post.click();
   }
 

 public void clickk() throws InterruptedException {
	 Thread.sleep(1000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollTo(0,0);");

		   city.click();
		   Thread.sleep(1000);
		   mumbai.click();
 }
		   
  public void startPosting() throws InterruptedException {       
	  Thread.sleep(1000);
			   posting.click();
		   }
		   
	 
 

public void Switch1() throws InterruptedException {
		

	Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
//	    wait.until(ExpectedConditions.visibilityOf(frameeeee));
		driver.switchTo().frame("webWidget");
		
		Thread.sleep(1000);
		frameeeee.click();
		
	}
public String TextProp() throws InterruptedException {
    Thread.sleep(2000);
    return propertyDetails.getText();	   
}
 //@Property--------------------------------------------------------------------------------


 
  public void click1() throws InterruptedException {
	  driver.get("https://www.nobroker.in/property/manage/rent/8a9fa2c38eef2a22018eef6c19c61168/property?nbFr=pyp_rent");
	 
       Thread.sleep(2000);
	   v.click();
  }
  

	public void selectVilla() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(selectType));
		selectType.click();	
	}
	
	 public void click2() throws InterruptedException {
		 Thread.sleep(1000);
		  bhk.click();
	  }
	  

		public void selectVilla1() throws InterruptedException {
			 Thread.sleep(1000);
			selectBhk.click();
		}
		 public void click3() throws InterruptedException {
			 
			 Thread.sleep(1000);
			  totalf.click();
				selectTf.click();
			 
		  }
		 public void click4() throws InterruptedException {
			 Thread.sleep(1000);
			  floor.click();
				selectf.click();
			 
		  }
		 public void click5() throws InterruptedException {
			 Thread.sleep(1000);
			  propertyAge.click();
				selectPA.click();
			 
		  }
		 public void click6(String area1) throws InterruptedException {
			 Thread.sleep(1000);
			 BA.sendKeys(area1);
			 
		  }
      
		 public void click7() throws InterruptedException {
			  Thread.sleep(1000);
				saveNcontinue.click();
			 }
		 
		 public String TextLocal() throws InterruptedException {
			    Thread.sleep(2000);
			    return locality.getText();	   
			}
//@Locality----------------------------------------------------------------------------------------------------------------------------
		 @FindBy(id="propertyLocality")
		 WebElement localityName1;


		 @FindBy(id="street")
		 WebElement street;

		 @FindBy(xpath="//button[@title=\"Zoom in\"]")
		 WebElement plus;

		 @FindBy(xpath="//button[@class=\"btn btn-primary\"]")
		 WebElement saveee;

		 @FindBy(xpath="//div[@class=\"pyp-form-header-container\"]")
		 WebElement rental;

		   public void localityName(String locality) throws AWTException, InterruptedException {
		 	  driver.get("https://www.nobroker.in/property/manage/rent/8a9f8a038eed7300018eed898563021d/locality?nbFr=pyp_rent");
		 	localityName1.sendKeys(locality);
		 	Thread.sleep(1000);
		 	 Actions actions = new Actions(driver);
		      actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		 }
		   
		   public void landmarkName(String land) throws InterruptedException {
		 	  
		 	  street.sendKeys(land);
		 		Thread.sleep(1000);
		   }
		   
		   public void zoom() {
		 	  JavascriptExecutor js=(JavascriptExecutor)driver;
		 	    js.executeScript("window.scroll(0,400)");
		 	
		   }
		   
		   public void addButton() throws InterruptedException {
		 	  Thread.sleep(1000);
		 	  plus.click();
		 	  plus.click();
		 	  plus.click();
		 	  plus.click();
		   }
		   
		   
		   public void sc() throws InterruptedException {
		 	  Thread.sleep(1000);
		 	  saveee.click();
		 	  
		 		Thread.sleep(1000);
		   }
		   public String TextRent() throws InterruptedException {
		 	    Thread.sleep(2000);
		 	    return rental.getText();	   
		 	}
		   
//@Renovation--------------------------------------------------------------------------------------------------------		   
		  
		   @FindBy(xpath="//img[@alt=\"Mumbai\"]")

			WebElement location;


		   
		    @FindBy(xpath = "//div[text()=\"Menu\"]")
		   WebElement menuTab;

		    @FindBy(xpath = "//a[text()=\"Painting & Cleaning\"]")
		    WebElement paintingCleaningOption;

		    @FindBy(xpath = "//div[text()=\"Home Renovation\"]")
		     WebElement homeRenovationOption;

		    @FindBy(id ="inputName")
		    WebElement name;

		    @FindBy(id = "inputNumber")
		    WebElement phone;

		    @FindBy(id = "SelectedCities")
		     WebElement cityDropdown;

		    @FindBy(xpath = "//button[text()=\"Get Free Quote\"]")
		    WebElement getFreeQuoteButton;
		    
		    @FindBy(xpath = "//div[text()=\"Thanks for your interest! Our Renovation Expert will contact you immediately!!\"]")
		    WebElement msg;

		    public void location1() {

				location.click();

		    }	
		    

		    public void clickMenuTab() {
		        menuTab.click();
		    }

		    public void clickPaintingCleaningOption() throws InterruptedException {
		    	
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].click();",paintingCleaningOption);
		    			Thread.sleep(1000);
		        
		    }
		    
		    public void SwitchToReadyToMove() {
		     			String mainWindowHandle = driver.getWindowHandle();
		     
		    			Set<String> allWindowHandles = driver.getWindowHandles();
		     
		    			for (String handle : allWindowHandles) {
		     			 if (!handle.equals(mainWindowHandle)) {
		     			 driver.switchTo().window(handle);
		     			 
		     			 break;
		     			 }
		     			}
		     	 }

		    public void clickHomeRenovationOption() throws InterruptedException {
		    	Thread.sleep(1000);
		        homeRenovationOption.click();
		    }
		    
		    public void Scroll() throws InterruptedException {
		    	Thread.sleep(2000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,400)");
			
			}

		    public void enterText(String name1, String no) throws InterruptedException {

		    	name.clear();
		    	Thread.sleep(2000);
		    	name.sendKeys(name1);
		    	Thread.sleep(1000);
		    	phone.clear();
		        Thread.sleep(2000);
		        phone.sendKeys(no);
		    }

		    public void selectCity() throws InterruptedException {
		    	Thread.sleep(1000);
		        Select select = new Select(cityDropdown);
		        select.selectByVisibleText("Mumbai");
		    }

		    public void clickGetFreeQuoteButton() throws InterruptedException {
		    	Thread.sleep(1000);
		        getFreeQuoteButton.click();
		    }
		    
		    public String MsgDisplayed() throws InterruptedException
		    {
		    	Thread.sleep(4000);
		    	return msg.getText();
		    }
		    
		 
//@FAQs------------------------------------------------------------------------------------------------------------
		 
		@FindBy(xpath="(//a[text()=\"Careers\"])[2]")
		WebElement career;
		 
		
		@FindBy(xpath="//div[text()=\"FAQs\"]")
		WebElement faqs;
		
		
		 public void scroll() throws InterruptedException {
			 
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,40000)");
			    JavascriptExecutor js1=(JavascriptExecutor)driver;
				 Thread.sleep(1000);
				    js1.executeScript("window.scroll(0,20000)");
				    JavascriptExecutor js2=(JavascriptExecutor)driver;
					 Thread.sleep(1000);
					    js2.executeScript("window.scroll(0,20000)");
				    
			 }
		 
		 public void careerClick() throws InterruptedException {
			 career.click();
			 Thread.sleep(1000);
			 
			 String mainWindowHandle = driver.getWindowHandle();
			 Set<String> allWindowHandles = driver.getWindowHandles();
			 for (String handle : allWindowHandles) {
				 if (!handle.equals(mainWindowHandle)) {
				 driver.switchTo().window(handle);
				 }
			 }
	}
		 
		public void navigate() {
			driver.get("https://www.nobroker.in/#signup-login");
		}
		
		
          public void scroll3() throws InterruptedException {
			 
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,40000)");
			 
          JavascriptExecutor js1=(JavascriptExecutor)driver;
            Thread.sleep(1000);
           js1.executeScript("window.scroll(0,20000)");
      
          JavascriptExecutor js2=(JavascriptExecutor)driver;
	       Thread.sleep(1000);
	    js2.executeScript("window.scroll(0,20000)");
	    }
          
          
		 public void faqClick() {
			 faqs.click();
		 }

}	


package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;

import DriverSetup.SetupDriver;
import Page.LoginClass;
import Page.PropertyPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;


public class PropertyDetails {
	static WebDriver driver;
	PropertyPage pg;
	LoginClass log;
	
	
	

@Given("User is logged in")
public void user_is_logged_in() throws InterruptedException, AWTException {
	driver=SetupDriver.chromedriver();
    log=new LoginClass(driver);
	log.userLogin();
	
 }

//@Post------------------------------------------------------------------------------------------------------
/*
 * Created By : Apurva Sarnaik
 * Reviewed By :
 * Motive :
 */
@When("User clicks on For Property owners from home page")
public void user_clicks_on_for_property_owners_from_home_page() throws InterruptedException {
	pg=new PropertyPage(driver);
	pg.click();
	
}

@And("User redirects to new tab and clicks on only active button")
public void user_redirects_to_new_tab_and_clicks_on_only_active_button() throws InterruptedException {
	pg.Switch();
	pg.onlyActive();
	pg.Switch1();
	  
}

@And("User clicks on post now option")
public void user_clicks_on_post_now_option() throws InterruptedException {
	pg.postNow();
   
}

@And("User select the city from dropdown")
public void user_select_the_city_from_dropdown() throws InterruptedException {
	  
	  pg.clickk();
}

@And("User clicks on Start Posting button")
public void user_clicks_on_start_posting_button() throws InterruptedException {
	pg.startPosting();
	
}

@Then("User should get Property details form")
public void user_should_get_property_details_form() throws InterruptedException {
	String act=pg.TextProp();
	String exp="Property Details";
	Assert.assertEquals(act,exp);
	
}

@AfterStep
public static void takeScreendown(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}


//@Property---------------------------------------------------------------------------------------------------------//

@When("User selects Apartment Type  from dropdown options")
public void user_selects_apartment_type_from_dropdown_options() throws InterruptedException, AWTException {
	pg=new PropertyPage(driver);
	  pg.click1();
    pg.selectVilla();
}

@And("User selects BHK Type  from dropdown options")
public void user_selects_bhk_type_from_dropdown_options() throws InterruptedException {
	
    pg.click2();
    pg.selectVilla1();
    
}

@And("User selects Floor from dropdown options")
public void user_selects_floor_from_dropdown_options() throws InterruptedException {
	
	pg.click3();
    
}

@And("User selects Total Floor  from dropdown options")
public void user_selects_total_floor_from_dropdown_options() throws InterruptedException {

   pg.click4();
}

@And("User selects  Property Age from dropdown options")
public void user_selects_property_age_from_dropdown_options() throws InterruptedException {
	
	pg.click5();
    
}

@And("^User enters (.*)$")
public void user_enters(String area) throws InterruptedException {
	
	pg.click6(area);
	
 }

@And("User clicks save &continue")
public void user_clicks_save_continue1() throws InterruptedException, AWTException {
	
    pg.click7();	
}



@Then("User should redirect to Locality details")
public void user_should_redirect_to_locality_details() throws InterruptedException {
	
	String act=pg.TextLocal();
	String exp="Locality *";
	Assert.assertEquals(act,exp);
    
}

@AfterStep
public static void takeScreendown1(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}
//@Locality------------------------------------------------------------------------------------------------------------//

@When("User enter the locality name and selects one from the dropdown")
public void user_enter_the_locality_name_and_selects_one_from_the_dropdown(DataTable datatable) throws AWTException, InterruptedException {
	pg=new PropertyPage(driver);
	
        List<String> localities  = datatable.asList(String.class);     
        for (String godrej : localities) {
       pg.localityName(godrej);
        }  
}

@And("User enter landmark")
public void user_enter_landmark(DataTable datatable) throws AWTException, InterruptedException {
	 List<String> landmark  = datatable.asList(String.class);     
     for (String petroleum : landmark) {
    pg.landmarkName(petroleum);
     } 
}

@And("User Zoom and out on the map")
public void user_zoom_and_out_on_the_map() throws InterruptedException {
	pg.zoom();
	pg.addButton();
    
}

@And("User clicks save& continue")
public void user_clicks_save_continue() throws InterruptedException {
	pg.sc();
    
}

@Then("User should redirect to Rental details form")
public void user_should_redirect_to_rental_details_form() throws InterruptedException {
	
	String act=pg.TextRent();
	String exp="Provide rental details about your property";
	Assert.assertEquals(act,exp);
    
}

@AfterStep
public static void takeScreendown4(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}


//@Renovation---------------------------------------------------------------------------------------------------------


@When("User clicks on menu tab")
public void user_clicks_on_menu_tab() {
	pg=new PropertyPage(driver);
   pg.clickMenuTab();
}

@And("User clciks on painting and cleaning option")
public void user_clciks_on_painting_and_cleaning_option() throws InterruptedException {
	pg.clickPaintingCleaningOption();
	pg.location1();
}

@And("User clicks on home renovation")
public void user_clicks_on_home_renovation() throws InterruptedException {
	
	pg.clickHomeRenovationOption();
	pg.SwitchToReadyToMove();
	pg.scroll();
}

@And("^User enter(.*) and (.*)$")
public void user_enter_and(String name, String no) throws InterruptedException {
	pg.enterText(name, no);
   
}

@And("User selects city")
public void user_selects_city() throws InterruptedException {
	pg.selectCity();
    
}

@And("User clicks on Get Free Qoute")
public void user_clicks_on_get_free_qoute() throws InterruptedException {
	pg.clickGetFreeQuoteButton();
	
   
}

@Then("User recieves a confirmation message")
public void user_recieves_a_confirmation_message() throws InterruptedException {
	String text="Thanks for your interest! Our Renovation Expert will contact you immediately!!";
	String msg1=pg.MsgDisplayed();
    Assert.assertEquals(text, msg1);
}

@AfterStep
public static void takeScreendown2(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}


//@FAQs------------------------------------------------------------------------------------------------------


@When("user scroll down on home page")
public void user_scroll_down_on_home_page() throws InterruptedException {
	pg=new PropertyPage(driver);
	  pg.scroll();
	  
}

@And("user clicks on Careers option and redirects to career tab")
public void user_clicks_on_careers_option_and_redirects_to_career_tab() throws InterruptedException {
	
	pg.careerClick();
	
    
}

@And("user comes back to home page and clicks on FAQs option")
public void user_comes_back_to_home_page_and_clicks_on_fa_qs_option() throws InterruptedException {
	
	pg.navigate();
	pg.scroll3();

	
    
}

@Then("user should redirect to FAQs tab")
public void user_should_redirect_to_fa_qs_tab() throws InterruptedException {
	
	pg.faqClick();
	String expected="https://www.nobroker.in/FAQs";
	Assert.assertEquals(driver.getCurrentUrl(),expected);
}

@AfterStep
public static void takeScreendown3(Scenario scenerio) {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}









	
}
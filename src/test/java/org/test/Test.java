package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;
import org.pageobject.PojoClass;
import org.utility.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test extends TestBase {
	
	
	@Given("User should launch chrom browser and load url")
	public void user_should_launch_chrom_browser_and_load_url() {
	
	lanuchChrome();
	maxWin();
	passURL("https://trello.com/login");
	}

	@When("User should click on login button")
	public void user_should_click_on_login_button() {
	}

	@When("User should enter username")
	public void user_should_enter_username() throws AWTException {
		PojoClass p = new PojoClass();
		sendKeyCall(p.getUsername(), "yuviraj098765@gmail.com");
		robotENTERCall();
	}

	@When("User should click on continue")
	public void user_should_click_on_continue() throws InterruptedException {
		PojoClass p = new PojoClass();

		Thread.sleep(5000);
		clickbtn(p.getLoginbtn());
	}

	@When("User should enter password")
	public void user_should_enter_password() throws AWTException {
		WaitImpcitwaitCall(20);
		siwtchIntoWindow();
		
		PojoClass p = new PojoClass();
		sendKeyCall(p.getPassword(), "Yuviraj@12345");
		robotENTERCall();
		
		
		
	}

	@When("User should click on log in button")
	public void user_should_click_on_log_in_button() throws AWTException {
		PojoClass p = new PojoClass();

		clickbtn(p.getLoginbtns());
		
		
	}
	
	@Then("User should navigate to Board page")
	public void user_should_navigate_to_Board_page() {
	    
	}

	@When("User should click on create board")
	public void user_should_click_on_create_board() {
		PojoClass p = new PojoClass();
		clickbtn(p.getCreateBoard());
	   
	}

	@When("User should Enter title of in editBox")
	public void user_should_Enter_title_of_in_editBox() {
		PojoClass p = new PojoClass();
		sendKeyCall(p.getBoardTitle(), "Yuva");
	   
	}

	@When("User should click on create button")
	public void user_should_click_on_create_button() {
		PojoClass p = new PojoClass();
		clickbtn(p.getCreate());
	    
	}
	
	@Then("User should navigate to board")
	public void user_should_navigate_to_board() {
	   
	}

	@When("User should enter the first board name")
	public void user_should_enter_the_first_board_name() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		PojoClass p = new PojoClass();
		//clickbtn(p.getAddAnotherList());
		//clickbtn(p.getBoard());
		sendKeyCall(p.getBoard(), "List A");
		robotENTERCall();
		
		
}

	@When("User should enter the second board name")
	public void user_should_enter_the_second_board_name() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		PojoClass p = new PojoClass();
//SendKeyActionCall(p.getBoard(), "List B");
		
		 act = new Actions(driver);
		 act.sendKeys("List B").build().perform();
		 robotENTERCall();
		 
		 clickbtn(p.getCancelButton());
		 
	   
	}

	@When("User should enter the add card in first board")
	public void user_should_enter_the_add_card_in_first_board() {
		PojoClass p = new PojoClass();
		clickbtn(p.getfirstClick());
		
		
		
		
	   
	}
	

	@When("User Should enter the title of first board")
	public void user_Should_enter_the_title_of_first_board() {
		PojoClass p = new PojoClass();
		//sendKeyCall(p.getFirsttitle(), "Full Creative");
		javaScriptExecutorSendKeycall("value", "Full Creative", p.getFirsttitle());
		 act = new Actions(driver);
		 act.sendKeys("Full Creative").build().perform();
		
	}

	@When("User should click on add card")
	public void user_should_click_on_add_card() {
		PojoClass p = new PojoClass();
		clickbtn(p.getFirstAdd());
	}

	@Then("User should drag and drop in first board to Second board")
	public void user_should_drag_and_drop_in_first_board_to_Second_board() throws AWTException {
		PojoClass p = new PojoClass();
		dragAndDropCall(p.getDrag(), p.getDrop());
////		
////		dropDownVisiableTextCall(p.getDropdown(), "List B");
////		
////		act.click(p.getMovebutton()).build().perform();
////		
////		robot = new Robot();
////		
////		robot.keyPress(KeyEvent.VK_ESCAPE);
////		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}


	@When("User should click on logout")
	public void user_should_click_on_logout() throws InterruptedException {
		PojoClass p = new PojoClass();
		//act = new Actions(driver);
		//act.moveToElement(p.getClickLogout()).click().build().perform();
		
		clickbtn(p.getClickLogout());
		WaitImpcitwaitCall(10);
		clickbtn(p.getClickLogout1());
	    
	}
	
}

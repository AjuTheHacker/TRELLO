package org.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.TestBase;

public class PojoClass extends TestBase {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtns() {
		return loginbtns;
	}

	@FindBy(id = "user")
	private WebElement username;

	public WebElement getCreateBoard() {
		return createBoard;
	}

	public WebElement getBoardTitle() {
		return boardTitle;
	}

	public WebElement getCreate() {
		return create;
	}

	@FindBy(id = "login")
	private WebElement loginbtn;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(id = "login-submit")
	private WebElement loginbtns;

	@FindBy(xpath = "//span[contains(text(),'Create ne')]")
	private WebElement createBoard;

	@FindBy(xpath = "//input[@autocomplete='off']")
	private WebElement boardTitle;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement create;

	public WebElement getAddAnotherList() {
		return addAnotherList;
	}

	@FindAll({ @FindBy(xpath = "(//div[@class='list-header-target js-editing-target'])[1]"),
			@FindBy(xpath = "//input[@type='text']") })
	private WebElement Board;

	@FindBy(xpath = "//span[text()='Add another list']")
	private WebElement addAnotherList;

	// span[text()='Add another list']

	public WebElement getBoard() {
		return Board;
	}

	public WebElement getfirstClick() {
		return firstClick;
	}

	@FindBy(xpath = "//a[contains(@class,'js-cancel-edit')]")
	private WebElement cancelButton;

	@FindBy(xpath = "//a[contains(@class,'js-open-card-composer')]")
	private WebElement firstClick;

	@FindBy(xpath = "//div[contains(@class,'list-card-details u-clearfix')]")
	private WebElement firsttitle;

	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement firstAdd;

	@FindBy(xpath = "(//span[text()='#1']//parent::span)[1]")
	private WebElement drag;

	@FindAll({ @FindBy(xpath = "(//div[contains(@class,'js-sortable ui-sortable')])[2]"),

			@FindBy(xpath = "//div[@class='card-composer-container js-card-composer-container']"),
			@FindBy(xpath = "//a[@class='open-card-composer js-open-card-composer']"),
			@FindBy(xpath = "(//span[text()='Add a card']//ancestor::a)[2]"),

	})
	private WebElement drop;

	@FindBy(xpath = "//a[@class='button-link js-move-card']")
	private WebElement move;

	@FindBy(xpath = "//select[@class='js-select-list']")
	private WebElement dropdown;

	@FindBy(xpath = "(//input[@type='submit'])[7]")
	private WebElement movebutton;

	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement clickLogout;
	
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement clickLogout1;
	

	public WebElement getClickLogout1() {
		return clickLogout1;
	}

	public WebElement getMove() {
		return move;
	}

	public WebElement getClickLogout() {
		return clickLogout;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getMovebutton() {
		return movebutton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getFirstClick() {
		return firstClick;
	}

	public WebElement getFirsttitle() {
		return firsttitle;
	}

	public WebElement getFirstAdd() {
		return firstAdd;
	}

	public WebElement getDrag() {
		return drag;
	}

	public WebElement getDrop() {
		return drop;
	}

}

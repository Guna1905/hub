package com.Pom_HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseTest;


public class Home_Page extends BaseTest{
	
	public WebDriver driver ;
	@FindBy (xpath = "//p[text() ='Men']")
	private WebElement clickButton;
	 
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getClickButton () {
		return clickButton;
		
	}
	@FindBy (id="men_category")
	private WebElement Shopmen;
	
	public WebElement getShopmen () {
		return Shopmen;

	}
	
	@FindBy (xpath ="//a[text()='formal shirts'][1]")
	private WebElement FormalShirt;
	
	public WebElement getFormalShirt () {
		return FormalShirt;
	}
	
	@FindBy (xpath = "//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0 shimmer shimmer-xl'][1]")
	private WebElement FirstShirt;
	
	public WebElement getFirstShirt () {
		return FirstShirt;
	}
	
	@FindBy (xpath = "//span[@class='br10  bd3  p410 hcP hbxs bxs bs size'][1]")
	private WebElement size38 ;
	
	public WebElement getSize38 () {
		return size38;
	}
	
	@FindBy (xpath = "//div[@data-pgn='Add to Cart'] ")
	
	private WebElement addToCart;
	
	public WebElement getaddToCart () {
		return addToCart;
	}
	
}

package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	@FindBy(xpath="//a[text()='Indian & Fusion Wear']/../following-sibling::li")
	private List<WebElement> indianAndFusionWear;
	/*@FindBy(xpath="//div[text()='Orders']")
	private WebElement order;
	@FindBy(xpath="//div[text()='Wishlist']")
	private WebElement wishlist;
	@FindBy(xpath="//a[text()='Gift Cards']")
	private WebElement giftCards;
	@FindBy(xpath="//a[text()='Myntra Insider']")
	private WebElement myntraInsider;
	@FindBy(xpath="//a[text()='Myntra Credit']")
	private WebElement myntraCredit;
	@FindBy(xpath="//a[text()='Coupons']")
	private WebElement coupons;
	@FindBy(xpath="//a[text()='Saved Cards']")
	private WebElement savedCards;
	@FindBy(xpath="//a[text()='Saved VPA']")
	private WebElement savedVPA;
	@FindBy(xpath="//a[text()='Saved Addresses']")
	private WebElement savedAddresses;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUs;*/
	public Women(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public List<WebElement> getIndianAndFusionWear() {
		return indianAndFusionWeared;
	}
	
}

package AmazonPages;

import base.CommonAPI;
import com.sun.org.apache.bcel.internal.generic.L2D;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.security.auth.x500.X500Principal;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(linkText = "Today's Deals")
    WebElement TodaysDeals;
    @FindBy(linkText = "Your Amazon.com")
    WebElement yourAmazon;
    @FindBy(linkText = "Gift Cards")
    WebElement GiftCard;
    @FindBy(linkText = "Help")
    WebElement help;
    @FindBy(linkText = "Registry")
    WebElement registry;
    @FindBy(linkText = "Sell")
    WebElement sell;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;
    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    WebElement searchSubmit;
    @FindBy(id = "icp-nav-flyout")
    WebElement language;
    @FindBy(xpath = "//div[@id='nav-flyout-icp']//span[@class='nav-text'][contains(text(),'Español - ES')]")
    WebElement es;
    @FindBy(xpath = "//div[@id='nav-flyout-icp']//a[2]//span[1]")
    WebElement zh;
    @FindBy(xpath = "//div[@id='nav-flyout-icp']//span[contains(@class,'nav-text')][contains(text(),'Deutsch - DE')]")
    WebElement de;
    @FindBy(id = "//div[@id='nav-flyout-icp']//span[@class='nav-text'][contains(text(),'Português - PT')]")
    WebElement pt;
    @FindBy(id = "//div[@id='nav-flyout-icp']//span[contains(@class,'nav-text')][contains(text(),'- KO')]")
    WebElement ko;
    @FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
    WebElement logo;
    @FindBy(xpath = "//a[@class='a-link-normal feed-carousel-control feed-left feed-control-disabled']")
    WebElement leftArrow;
    @FindBy(xpath = "//a[@class='a-link-normal feed-carousel-control feed-right']")
    WebElement rightArrow;

    public void MenuLinks(){
        ArrayList<WebElement> el = new ArrayList<WebElement>();
        el.add(TodaysDeals); el.add(yourAmazon); el.add(GiftCard); el.add(help); el.add(registry); el.add(sell);
        for(WebElement e: el){
            e.click();
            driver.navigate().back();
        }

    }
    public void searchBox(){
        searchbox.sendKeys("Kitchen Aid ");
        searchSubmit.click();
    }
    public void langage(){
        ArrayList<WebElement> el = new ArrayList<WebElement>();
        el.add(es); el.add(zh); el.add(de); el.add(pt); el.add(ko);
        for(WebElement e: el){
            mouseHoverByXpath(language);
            e.click();
        }

    }
    public void Logo(){
       logo.click();
    }
    public void Arrow(){
        leftArrow.click();
        sleepFor(3);
        rightArrow.click();
    }



}

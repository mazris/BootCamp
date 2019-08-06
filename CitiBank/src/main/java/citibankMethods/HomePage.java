package citibankMethods;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    //menu
    @FindBy(id = "creditcards")
    WebElement creditcards;
    @FindBy(id = "viewAllCards_Link")
    WebElement viewAllCards;
    @FindBy(id = "lowInterestCards_Link")
    WebElement lowInterestCards;
    @FindBy(id = "balanceTransferCards_Link")
    WebElement balanceTransferCards;
    @FindBy(id = "rewardsCards_Link")
    WebElement rewardsCards;
    @FindBy(id = "preQualifiedCards_Link")
    WebElement preQualifiedCards;
    @FindBy(id = "banking")
    WebElement banking;
    @FindBy(id = "bankingOverview_Link")
    WebElement bankingOverView;
    @FindBy(id = "checkingBanking_Link")
    WebElement checkingBanking;
    @FindBy(id = "savingsBanking_Link")
    WebElement savingBanking;
    @FindBy(id = "cdiraBanking_Link")
    WebElement cdiraBanking;
    @FindBy(id = "iraBanking_Link")
    WebElement iraBanking;
    @FindBy(id = "ratesBanking_Link")
    WebElement rateBanking;
    @FindBy(id = "lending")
    WebElement lending;
    @FindBy(id = "personalLoanCredLine_Link")
    WebElement personalLoan;
    @FindBy(id = "mortgageId_Link")
    WebElement mortgage;
    @FindBy(id = "homeEquity_Link")
    WebElement homeEquality;
    @FindBy(id = "investing")
    WebElement investing;
    @FindBy(id = "financialGoals_Link")
    WebElement financialGoals;
    @FindBy(id = "investingCiti_Link")
    WebElement investingCiti;
    @FindBy(id = "insightsTools_Link")
    WebElement insightTools;
    @FindBy(id = "citiGold_Link")
    WebElement citiGold;
    @FindBy(id = "headerLoka ogoLink")
    WebElement logo;
    @FindBy(id = "citi-search-icon")
    WebElement search;
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "signInBtn")
    WebElement signInBtn;
    @FindBy(id = "rememberUid")
    WebElement rememberUid;
    @FindBy(id = "citi-autocomplete-content-searchbox-livesearch")
    WebElement searchBox;
    @FindBy(xpath = "//button[@class='citi-autocomplete-content-searchbox-go']")
    WebElement searchButton;

    //Credits Card
    public void viewAllCards(){
        mouseHoverByXpath(creditcards);
       viewAllCards.click();
    }
    public void lowInterestcard(){
        mouseHoverByXpath(creditcards);
        lowInterestCards.click();
    }
    public void balanceTransfer(){
        mouseHoverByXpath(creditcards);
        balanceTransferCards.click();
    }
    public void rewardcard(){
        mouseHoverByXpath(creditcards);
        rewardsCards.click();
    }
    public void preQualified(){
        mouseHoverByXpath(creditcards);
        preQualifiedCards.click();
    }
   //Banking
    public void bankingOverView(){
        mouseHoverByXpath(banking);
        bankingOverView.click();
    }
    public void CheckingBanking(){
        mouseHoverByXpath(banking);
        checkingBanking.click();
    }
    public void savingBanking(){
        mouseHoverByXpath(banking);
        savingBanking.click();
    }
    public void cdiraBanking(){
        mouseHoverByXpath(banking);
        cdiraBanking.click();
    }
    public void iraBanking(){
        mouseHoverByXpath(banking);
        iraBanking.click();
    }
    public void rateBanking(){
        mouseHoverByXpath(banking);
        rateBanking.click();
    }
    //lending
    public void personalLoan(){
        mouseHoverByXpath(lending);
        personalLoan.click();
    }
    public void mortgage(){
        mouseHoverByXpath(lending);
        mortgage.click();
    }
    public void homeEquality(){
        mouseHoverByXpath(lending);
        homeEquality.click();
    }
    //investing
    public void yourFinancialGoal(){
        mouseHoverByXpath(investing);
        financialGoals.click();
    }
    public void investingCiti(){
        mouseHoverByXpath(investing);
        investingCiti.click();
    }
    public void insightTools(){
        mouseHoverByXpath(investing);
        insightTools.click();
    }
    //CitiGold
    public void citiGold(){
        citiGold.click();
    }
    //logo
    public void logo(){
        if(logo.isDisplayed())
            logo.click();
        else
            System.out.println("Logo is not displayed");
    }
    //search Icon
    public void search(){
        search.click();
    }
    //SignIn
    public void signIn(){
        username.clear();
        username.sendKeys("Sonia");
        password.clear();
        password.sendKeys("123");
        signInBtn.click();
    }
    public void searchBox(){
        searchBox.clear();
        searchBox.sendKeys("Saving");
        searchButton.click();
    }






}

package citibankTest;

import base.CommonAPI;
import citibankMethods.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.Repeatable;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void initialization(){ homePage = PageFactory.initElements(driver,HomePage.class); }
   //creditCard

   @Test(priority = 1)
    public void testViewAllCards(){
        homePage.viewAllCards();

    }
    @Test(priority = 2)
    public void testLowerInterest(){homePage.lowInterestcard();}
    @Test(priority = 3)
    public void testBalance(){homePage.balanceTransfer();}
    @Test(priority = 4)
    public void testpreQualified(){homePage.preQualified();}
    @Test(priority = 5)
    public void testreward(){homePage.rewardcard();}
    //Banking
    @Test(priority = 6)
    public void testBankingOverview(){
        homePage.bankingOverView();
    }
    @Test(priority = 7)
    public void testCheckingBanking(){
        homePage.CheckingBanking();
    }
    @Test(priority = 8)
    public void testsavingBanking(){
        homePage.savingBanking();
    }
    @Test(priority = 9)
    public void testcdirBanking(){
        homePage.cdiraBanking();
    }
    @Test(priority = 10)
    public void testiraBanking(){
        homePage.iraBanking();
    }
    @Test(priority = 11)
    public void testrateBanking(){
        homePage.rateBanking();
    }
    //Loan
    @Test(priority = 12)
    public void testPersonalLoan(){
        homePage.personalLoan();
    }
    @Test(priority = 13)
    public void testmortgage(){
        homePage.mortgage();
    }
    @Test(priority = 14)
    public void testhomeEquality(){
        homePage.homeEquality();
    }
   @Test(priority = 15)
    public void testCitiGold(){
        homePage.citiGold();
   }
   @Test(priority = 16)
    public void testLogo(){
        homePage.logo();
   }
   @Test(priority = 17)
    public void testSearch(){
        homePage.search();
        homePage.searchBox();
   }
   @Test(priority = 18)
    public void testSignIn(){
        homePage.signIn();
   }
   @Test(priority = 19)
    public void testYourFinancialGoals(){
        homePage.yourFinancialGoal();
   }
   @Test(priority = 20)
    public void testInvestingCiti(){
        homePage.investingCiti();
   }
   @Test(priority = 21)
    public void testInsightTools(){
        homePage.insightTools();
   }








}

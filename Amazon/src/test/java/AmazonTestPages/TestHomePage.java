package AmazonTestPages;

import AmazonPages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void initialization(){homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test(priority = 1)
    public void testMenuLinks(){
        homePage.MenuLinks();
    }
    @Test(priority = 2)
    public void testSearchBox(){
        homePage.searchBox();
    }
    @Test(priority = 3)
    public void testLangague(){
        homePage.langage();
    }

   @Test(priority = 4)
    public void TestLogo(){
        homePage.Logo();
   }
   @Test(priority = 5)
    public void testArrow(){
       homePage.Arrow();
   }


}

package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.PlaceOrder_Interface;
import mExpanse.Pages.ObjectRepository.PlaceOrderOR;
import org.openqa.selenium.WebDriver;

public class PlaceOrder_Impl implements PlaceOrder_Interface {

    @Override
    public void placeOrder(WebDriver driver) throws InterruptedException {
        Operations.click(PlaceOrderOR.Locator.Electronics,driver);
        Operations.click(PlaceOrderOR.Locator.CellPhone,driver);
        Operations.click(PlaceOrderOR.Locator.Nokia,driver);
        Operations.sendText(PlaceOrderOR.Locator.Count,"2",driver);
        Operations.click(PlaceOrderOR.Locator.AddToCart,driver);
        Operations.click(PlaceOrderOR.Locator.ShoppingCart,driver);
        Operations.click(PlaceOrderOR.Locator.Terms,driver);
        Operations.click(PlaceOrderOR.Locator.Checkout,driver);
        Operations.click(PlaceOrderOR.Locator.CheckoutAsGuest,driver);
        Operations.sendText(PlaceOrderOR.Locator.FirstName,"Arman",driver);
        Operations.sendText(PlaceOrderOR.Locator.LastName,"Hossen",driver);
        Operations.sendText(PlaceOrderOR.Locator.Email,"test123@test.com",driver);
        Operations.click(PlaceOrderOR.Locator.Country,driver);
        Operations.click(PlaceOrderOR.Locator.Australia,driver);
        Thread.sleep(2000);
        Operations.click(PlaceOrderOR.Locator.State,driver);
        Operations.click(PlaceOrderOR.Locator.SouthAus,driver);
        Operations.sendText(PlaceOrderOR.Locator.City,"Perth",driver);
        Operations.sendText(PlaceOrderOR.Locator.Address,"Test Address",driver);
        Operations.sendText(PlaceOrderOR.Locator.Zip,"8100",driver);
        Operations.sendText(PlaceOrderOR.Locator.Phone,"23416546",driver);
        Operations.click(PlaceOrderOR.Locator.Continue1,driver);
        Operations.click(PlaceOrderOR.Locator.NextDayAir,driver);
        Operations.click(PlaceOrderOR.Locator.Continue2,driver);
        Operations.click(PlaceOrderOR.Locator.CreditCard,driver);
        Operations.click(PlaceOrderOR.Locator.Continue3,driver);

        Operations.sendText(PlaceOrderOR.Locator.CardHolderName,"Arman Hossen",driver);
        Operations.sendText(PlaceOrderOR.Locator.CardNumber,"4637 6775 0148 3331",driver);
        Operations.click(PlaceOrderOR.Locator.ExpYr,driver);
        Operations.click(PlaceOrderOR.Locator.Year,driver);
        Operations.sendText(PlaceOrderOR.Locator.CardCode,"810",driver);
        Operations.click(PlaceOrderOR.Locator.Continue4,driver);
        Thread.sleep(3000);
        Operations.click(PlaceOrderOR.Locator.Confirm,driver);
        Operations.matchText(PlaceOrderOR.Locator.Msg,PlaceOrderOR.UIElements.Msg,driver);
        Thread.sleep(3000);
    }

}

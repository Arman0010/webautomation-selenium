package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.PlaceOrder_Interface;
import mExpanse.Pages.ObjectRepository.RegistrationOR;
import org.openqa.selenium.WebDriver;

public class PlaceOrder_Impl implements PlaceOrder_Interface {

    @Override
    public void placeOrder(WebDriver driver) throws InterruptedException {
        Operations.click(RegistrationOR.Locator.Register,driver);

        Thread.sleep(3000);
        System.out.println("Success");
    }

}

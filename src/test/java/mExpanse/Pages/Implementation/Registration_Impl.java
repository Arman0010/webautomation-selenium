package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Registration_Interface;
import mExpanse.Pages.ObjectRepository.RegistrationOR;
import org.openqa.selenium.WebDriver;

public class Registration_Impl implements Registration_Interface {

    @Override
    public void registration(WebDriver driver) throws InterruptedException {
        Operations.click(RegistrationOR.Locator.Register,driver);
        Thread.sleep(2000);
        Operations.click(RegistrationOR.Locator.Gender,driver);
        Operations.sendText(RegistrationOR.Locator.FirstName,"Arman",driver);
        Operations.sendText(RegistrationOR.Locator.LastName,"Hossen",driver);
        Operations.click(RegistrationOR.Locator.dobD,driver);
        Operations.click(RegistrationOR.Locator.Day2,driver);
        Thread.sleep(1000);
        Operations.click(RegistrationOR.Locator.dobM,driver);
        Operations.click(RegistrationOR.Locator.Mon3,driver);
        Thread.sleep(1000);
        Operations.click(RegistrationOR.Locator.dobY,driver);
        Operations.click(RegistrationOR.Locator.Yer3,driver);
        Thread.sleep(1000);
        Operations.sendText(RegistrationOR.Locator.Email,Operations.generateValidRandomEmail("arman"),driver);
        Operations.sendText(RegistrationOR.Locator.Company,"Brainstation-23",driver);
        Operations.sendText(RegistrationOR.Locator.Password,"pass@1234",driver);
        Operations.sendText(RegistrationOR.Locator.ConfirmPassword,"pass@1234",driver);
        Operations.click(RegistrationOR.Locator.RegButton,driver);
        Operations.matchText(RegistrationOR.Locator.Msg,RegistrationOR.UIElements.Msg,driver);
        Thread.sleep(3000);
    }

}

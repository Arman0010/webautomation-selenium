package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class PlaceOrderOR {
    public static class Locator{
        public static By Electronics = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a");
        public static By CellPhone = By.xpath("//IMG[@alt='Picture for category Cell phones']");
        public static By Nokia = By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");
        public static By Count = By.xpath("//input[@id='product_enteredQuantity_20']");
        public static By AddToCart = By.xpath("//BUTTON[@id='add-to-cart-button-20']");
        public static By ShoppingCart = By.xpath("//A[@href='/cart'][text()='shopping cart']");
        public static By Terms = By.xpath("//INPUT[@id='termsofservice']");
        public static By Checkout = By.xpath("//BUTTON[@id='checkout']");
        public static By CheckoutAsGuest = By.xpath("//BUTTON[@type='button'][text()='Checkout as Guest']");
        public static By FirstName = By.xpath("//INPUT[@id='BillingNewAddress_FirstName']");
        public static By LastName = By.xpath("//INPUT[@id='BillingNewAddress_LastName']");
        public static By Email = By.xpath("//INPUT[@id='BillingNewAddress_Email']");
        public static By Country = By.xpath("//SELECT[@id='BillingNewAddress_CountryId']");
        public static By Australia = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[16]");
        public static By State = By.xpath("//SELECT[@id='BillingNewAddress_StateProvinceId']");
        public static By SouthAus = By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]/option[6]");
        public static By City = By.xpath("//INPUT[@id='BillingNewAddress_City']");
        public static By Address = By.xpath("//INPUT[@id='BillingNewAddress_Address1']");
        public static By Zip = By.xpath("//INPUT[@id='BillingNewAddress_ZipPostalCode']");
        public static By Phone = By.xpath("//INPUT[@id='BillingNewAddress_PhoneNumber']");
        public static By Continue1 = By.xpath("(//BUTTON[@type='button'][text()='Continue'])[1]");
        public static By NextDayAir = By.xpath("//INPUT[@id='shippingoption_1']");
        public static By Continue2 = By.xpath("(//BUTTON[@type='button'][text()='Continue'])[3]");
        public static By CreditCard = By.xpath("//INPUT[@id='paymentmethod_1']");
        public static By Continue3 = By.xpath("(//BUTTON[@type='button'][text()='Continue'])[4]");
        public static By CardHolderName = By.xpath("//INPUT[@id='CardholderName']");
        public static By CardNumber = By.xpath("//INPUT[@id='CardNumber']");
        public static By CardCode = By.xpath("//INPUT[@id='CardCode']");
        public static By ExpYr = By.xpath("//SELECT[@id='ExpireYear']");
        public static By Year = By.xpath("//*[@id=\"ExpireYear\"]/option[4]");
        public static By Continue4 = By.xpath("(//BUTTON[@type='button'][text()='Continue'])[5]");
        public static By Confirm = By.xpath("//BUTTON[@type='button'][text()='Confirm']");
        public static By Msg = By.xpath("//STRONG[text()='Your order has been successfully processed!']");
    }

    public static class UIElements{
        public static String Msg = "Your order has been successfully processed!";
    }
}

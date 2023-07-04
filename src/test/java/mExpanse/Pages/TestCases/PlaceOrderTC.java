package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.PlaceOrder_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class PlaceOrderTC extends BaseClass{
    PlaceOrder_Impl po= new PlaceOrder_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void placeOrder() throws InterruptedException {
        po.placeOrder(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}

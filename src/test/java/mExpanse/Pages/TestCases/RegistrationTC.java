package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Registration_Impl;
import org.testng.annotations.*;

@Listeners(mExpanse.Listener.CustomListener.class)
public class RegistrationTC extends BaseClass{
    Registration_Impl reg= new Registration_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void Registration() throws InterruptedException {
        reg.registration(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {
        tearDown();
    }
}

package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;
public class RegistrationOR {
    public static class Locator{
        public static By Register = By.xpath("//A[@href='/register?returnUrl=%2F'][text()='Register']");
        public static By Gender = By.xpath("//INPUT[@id='gender-male']");
        public static By FirstName = By.xpath("//INPUT[@id='FirstName']");
        public static By LastName = By.xpath("//INPUT[@id='LastName']");
        public static By dobD = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
        public static By Day2 = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[3]");
        public static By dobM = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
        public static By Mon3 = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[4]");
        public static By dobY = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
        public static By Yer3 = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[4]");
        public static By Email = By.xpath("//INPUT[@id='Email']");
        public static By Company = By.xpath("//INPUT[@id='Company']");
        public static By Password = By.xpath("//INPUT[@id='Password']");
        public static By ConfirmPassword = By.xpath("//INPUT[@id='ConfirmPassword']");
        public static By RegButton = By.xpath("//BUTTON[@id='register-button']");
        public static By Msg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");

    }

    public static class UIElements{
        public static String Msg = "Your registration completed";
    }
}

package com.TestMayurkumar.PageObject;

import com.TestMayurkumar.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends DriverFactory {

    @FindBy(linkText = "Sign in")
    WebElement signIn;

    public void signInButton(){
        signIn.click();
    }

    @FindBy(id = "email")
    WebElement emailAddress;
    @FindBy(id = "passwd")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement signInClick;

    public void signInProcess(){
        emailAddress.sendKeys("mkp802002@gmail.com");
        password.sendKeys("shreeram123");
        signInClick.click();
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
    WebElement personalInformation;

    public void PersonalInformationButton(){
        personalInformation.click();
    }

    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id = "old_passwd")
    WebElement currentPassword;
    @FindBy(id = "passwd")
    WebElement newPassword;
    @FindBy(id = "confirmation")
    WebElement confirmation;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button/span")
    WebElement saveButton;

    public void updatePersonalInformation(){
    firstName.clear();
    firstName.sendKeys("Mayurkumar");
    currentPassword.sendKeys("shreeram123");
    newPassword.sendKeys("shreeram1234");
    confirmation.sendKeys("shreeram1234");
    saveButton.click();
    }
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement message;

    public void updatedMessage(){
        String updatedSuccessfully = message.getText();
        System.out.println(updatedSuccessfully);
        Assert.assertEquals(updatedSuccessfully,"Your personal information has been successfully updated.");
    }

}

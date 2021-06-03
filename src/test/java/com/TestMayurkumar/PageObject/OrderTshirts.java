package com.TestMayurkumar.PageObject;

import com.TestMayurkumar.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderTshirts extends DriverFactory {


    public void currentUrl(){
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tshirts;

    public void orderTshirts(){
        tshirts.click();
    }

    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    WebElement product;

    public void tShirtProduct(){
        product.click();
    }

    @FindBy(css = "#add_to_cart")
    WebElement addToCart;

    public void serAddToCart (){
        addToCart.click();
    }

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement procedureCheckout;

    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    WebElement actualOrder;

    public void cartBox(){
      procedureCheckout.click();
      String checkoutUrl = driver.getCurrentUrl();
      System.out.println(checkoutUrl);
        Assert.assertEquals(checkoutUrl,"http://automationpractice.com/index.php?controller=order");
      String checkOutProduct = actualOrder.getText();
      System.out.println(checkOutProduct);
      Assert.assertEquals(checkOutProduct,"Faded Short Sleeve T-shirts");
    }

}

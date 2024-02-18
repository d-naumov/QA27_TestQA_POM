package com.testqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {

  public WindowsPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//a[contains(text(),'Click Here')]")
  WebElement windows;

  public WindowsPage clickHereLink() {
    click(windows);
    return this;
  }
}

package com.testqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage {

  public DropdownPage(WebDriver driver) {
    super(driver);
  }

  // @FindBy(xpath = "//select[@id='dropdown']")
  @FindBy(xpath = "//option[contains(text(),'Option 1')]")
  WebElement dropdown;

  public DropdownPage selectOptionFromDropdown(String text) {
    click(dropdown);
    return this;
  }


}

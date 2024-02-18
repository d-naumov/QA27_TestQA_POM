package com.testqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


  public HomePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
  WebElement javaScriptAlert;

  public AlertsPage getJavaScriptAlerts() {
    click(javaScriptAlert);
    return new AlertsPage(driver);
  }

  @FindBy(xpath = "//a[contains(text(),'Dropdown')]")
  WebElement selectDropdown;

  public DropdownPage getDropdown() {
    click(selectDropdown);
    return new DropdownPage(driver);
  }

  @FindBy(xpath = "//a[contains(text(),'Multiple Windows')]")
  WebElement multipleWindows;

  public WindowsPage getWindowsPage() {
    click(multipleWindows);
    return new WindowsPage(driver);

  }
}

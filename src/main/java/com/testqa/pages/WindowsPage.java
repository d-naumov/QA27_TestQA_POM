package com.testqa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WindowsPage extends BasePage {

  public WindowsPage(WebDriver driver) {
    super(driver);
  }


  @FindBy(xpath = "//a[contains(text(),'Click Here')]")
  WebElement clickHere;
//  public WindowsPage switchToNextTab(int index) {
//    click(clickHere);
//    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//    // Проверка наличия нужного индекса перед попыткой переключения
//    if (index >= 0 && index < tabs.size()) {
//      driver.switchTo().window(tabs.get(index));
//    } else {
//      // Обработка ситуации, когда индекс выходит за пределы списка
//      System.out.println("Index out of bounds: " + index);
//    }
//
//    return this;
//  }
  public WindowsPage switchToNextTab(int index) {
    click(clickHere);
    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(index));

    return this;
  }

  @FindBy(xpath = "//h3[contains(text(),'New Window')]")
  WebElement newWindow;

  public WindowsPage verifyTextFromNewTab(String text) {

    Assert.assertTrue(shouldHaveText(newWindow, text, 10));

    return this;
  }


}

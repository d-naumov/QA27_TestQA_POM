package com.testqa.tests;


import com.testqa.pages.HomePage;
import com.testqa.pages.WindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase {

  @BeforeMethod
  public void precondition() {

    new HomePage(driver).getWindowsPage();

  }

  @Test
  public void testOpenNewWindow() {

    WindowsPage windowsPage = new WindowsPage(driver);
    windowsPage.switchToNextTab(1).verifyTextFromNewTab("New Window");;
  }


}

package com.testqa.tests;


import com.testqa.pages.DropdownPage;
import com.testqa.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase {

  @BeforeMethod
  public void precondition() {
    new HomePage(driver).getDropdown();

  }

  @Test
  public void testDropdownSelection() {
    new DropdownPage(driver).selectOptionFromDropdown("Option 1");
  }


}

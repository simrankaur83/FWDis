package com.github.wasiqb.coteafs.selenium.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;
import com.github.wasiqb.coteafs.selenium.core.element.ITextboxActions;

public class LoginPage extends BrowserPage {
  public ITextboxActions password () {
    return form ().find (By.name ("password"), "Password");
  }

  public IMouseActions signIn () {
    return form ().find (By.name ("btnLogin"), "Login");
  }

  public ITextboxActions userId () {
    return form ().find (By.name ("uid"), "User ID");
  }

  private IMouseActions form () {
    return onClickable (By.name ("frmLogin"), "Form");
  }
}


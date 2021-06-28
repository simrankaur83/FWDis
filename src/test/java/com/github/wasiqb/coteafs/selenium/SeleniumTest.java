package com.github.wasiqb.coteafs.selenium;

import static com.github.wasiqb.coteafs.selenium.config.ConfigUtil.appSetting;
import static com.github.wasiqb.coteafs.selenium.pages.action.LoginPageAction.PASS;
import static com.github.wasiqb.coteafs.selenium.pages.action.LoginPageAction.USER_ID;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.wasiqb.coteafs.selenium.core.BrowserTest;
import com.github.wasiqb.coteafs.selenium.pages.MainPage;
import com.github.wasiqb.coteafs.selenium.pages.action.LoginPageAction;

public class SeleniumTest extends BrowserTest {
  @BeforeClass
  public void setupMethod () {
    final MainPage main = new MainPage ();
    main.onDriver ()
      .navigateTo (appSetting ().getUrl ());
  }

  @Test
  public void testSignIn () {
    final LoginPageAction login = new LoginPageAction ();
    login.addInputValue (USER_ID, appSetting ().getParams ()
      .get ("user"))
      .addInputValue (PASS, appSetting ().getParams ()
      .get ("password"))
      .perform ();
  }
}

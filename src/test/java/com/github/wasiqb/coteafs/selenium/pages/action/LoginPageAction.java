package com.github.wasiqb.coteafs.selenium.pages.action;

import static java.text.MessageFormat.format;

import com.github.wasiqb.coteafs.selenium.core.page.AbstractPageAction;
import com.github.wasiqb.coteafs.selenium.pages.LoginPage;
import com.github.wasiqb.coteafs.selenium.pages.MainPage;

public class LoginPageAction extends AbstractPageAction <LoginPageAction> {
  public static final String PASS    = "password";
  public static final String USER_ID = "userId";

  @Override
  public void perform () {
    final LoginPage login = new LoginPage ();
    login.userId ()
      .enterText (value (USER_ID));
    login.password ()
      .enterText (value (PASS));
    login.signIn ()
      .click ();

    login.nextPage (MainPage.class)
      .managerIdBanner ()
      .verifyText ()
      .endsWith (format ("Manger Id : {0}", value (USER_ID).toString ()));
  }
}


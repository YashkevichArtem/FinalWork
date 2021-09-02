package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    SelenideElement usernameField = $("#txtUsername");
    SelenideElement passwordField = $("#txtPassword");
    SelenideElement loginButton = $("#btnLogin");
    SelenideElement welcomeMessage = $("div>h1");
    SelenideElement welcomePanel = $("#welcome");
    SelenideElement logout = $("a[href*=\"logout\"]");
    SelenideElement loginPanel = $("#logInPanelHeading");
    SelenideElement resetPass = $("a[href*=\"request\"]");
    SelenideElement userName = $("#securityAuthentication_userName");
    SelenideElement resetPassBtn = $("#btnSearchValues");

    @Step("Login fields")
    public void login() throws IOException {
        Properties log = new Properties();
        log.load(new FileInputStream("src/main/resources/log.info"));
        usernameField.sendKeys(log.getProperty("us.username"));
        passwordField.sendKeys(log.getProperty("us.password"));
        loginButton.click();

    }

    @Step("Open website")
    public void openLoginPage(){
        open("https://opensource-demo.orangehrmlive.com/"); }

    @Step("Login out")
    public void logOut(){
        welcomePanel.click();
        logout.click();
    }
}


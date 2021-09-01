package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AddUser extends LoginPage {
    SelenideElement btnAdmin = $("#menu_admin_viewAdminModule");
    SelenideElement btnAdd = $("#btnAdd");
    SelenideElement nameField = $("#systemUser_employeeName_empName");
    SelenideElement userField = $("#systemUser_userName");
    SelenideElement userPass = $("#systemUser_password");
    SelenideElement confPass = $("#systemUser_confirmPassword");
    SelenideElement btnSave = $("#btnSave");
    SelenideElement completeMessage = $("div.message.success.fadable");

    @Step("Add user")
    public void add(){
        btnAdmin.click();
        btnAdd.click();
        nameField.sendKeys("Alice Duval");
        userField.sendKeys("Vasiliiy");
        userPass.sendKeys("Qwertyui");
        confPass.sendKeys("Qwertyui");
        btnSave.click();
    }

}

package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AddUser extends LoginPage {
    SelenideElement btnAdmin = $("#menu_admin_viewAdminModule");
    SelenideElement btnAdd = $("#btnAdd");
    SelenideElement userRoleField = $("#systemUser_userType");
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
        userRoleField.shouldBe(Condition.visible);
        nameField.shouldBe(Condition.visible).sendKeys("Manali Kulkarni");
        userField.shouldBe(Condition.visible).sendKeys("Vasiliiyy");
        userPass.shouldBe(Condition.visible).sendKeys("Qwertyui");
        confPass.shouldBe(Condition.visible).sendKeys("Qwertyui");
        btnSave.click();
    }

}

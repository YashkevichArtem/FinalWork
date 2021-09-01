package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddCandidate extends AddUser {
    SelenideElement recrModule = $(By.xpath("//*[text()='Recruitment']"));
    SelenideElement addFirstName = $("#addCandidate_firstName");
    SelenideElement addLastName = $("#addCandidate_lastName");
    SelenideElement addEmail = $("#addCandidate_email");

    @Step("Add candidate")
    public void addCandidate(){
        recrModule.click();
        btnAdd.click();
        addFirstName.sendKeys("FirstName");
        addLastName.sendKeys("LastName");
        addEmail.sendKeys("qwerty@mail.ru");
        btnSave.click();
    }
}

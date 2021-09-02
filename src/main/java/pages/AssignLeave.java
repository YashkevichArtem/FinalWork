package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class AssignLeave extends AddUser{
    SelenideElement leaveModul = $(By.xpath("//*[text()='Leave']"));
    SelenideElement assLeave = $("#menu_leave_assignLeave");
    SelenideElement empName = $("#assignleave_txtEmployee_empName");
    SelenideElement leaveType = $("option:nth-child(2)");
    SelenideElement calendarBtnFrom = $("#assignleave_txtFromDate");
    SelenideElement calendarBtnTo = $("#assignleave_txtToDate");
    SelenideElement assignButton = $("#assignBtn");
    SelenideElement confirmOkBtn = $("#confirmOkButton");

    @Step("Assign leave")
    public void assignLeave(){
        leaveModul.click();
        assLeave.click();
        empName.shouldBe(Condition.visible).sendKeys("Nathan Elliot");
        leaveType.shouldBe(Condition.visible).click();
        calendarBtnFrom.shouldBe(Condition.visible).setValue("2021-09-09").click();
        calendarBtnTo.shouldBe(Condition.visible).setValue("2021-09-15").click();
        assignButton.pressEnter();
        confirmOkBtn.pressEnter();
    }
}

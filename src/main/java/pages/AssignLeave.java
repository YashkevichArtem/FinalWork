package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AssignLeave extends AddUser{
    SelenideElement leaveModul = $(By.xpath("//*[text()='Leave']"));
    SelenideElement assLeave = $("#menu_leave_assignLeave");
    SelenideElement empName = $("#assignleave_txtEmployee_empName");
    SelenideElement leaveType = $("option:nth-child(6)");
    SelenideElement fromDateField = $("#assignleave_txtFromDate");
    SelenideElement toDateField = $("#assignleave_txtToDate");
    SelenideElement assignButton = $("#assignBtn");

    @Step("Assign leave")
    public void assignLeave(){
        leaveModul.click();
        assLeave.click();
        empName.sendKeys("Prajakta Dhumal");
        leaveType.click();
        fromDateField.sendKeys("01/09/2021");
        toDateField.sendKeys("30/09/2021");
        assignButton.click();
    }
}

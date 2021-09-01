package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JobTitle extends AddUser{
    SelenideElement menuJob = $("#menu_admin_Job");
    SelenideElement jobTitleBtn = $("#menu_admin_viewJobTitleList");
    SelenideElement btnAdd = $("#btnAdd");
    SelenideElement titleField = $("#jobTitle_jobTitle");
    SelenideElement selAutomation_QA = $(By.xpath("//*[text()='Automation_QA']/../..//input[@type='checkbox']"));
    SelenideElement selQA_engineer = $(By.xpath("//*[text()='QA_engineer']/../..//input[@type='checkbox']"));
    SelenideElement selQA_AutomationEn = $(By.xpath("//*[text()='QA_Automation engineer']/../..//input[@type='checkbox']"));
    SelenideElement btnDel = $("#btnDelete");
    SelenideElement btnDelOk = $("#dialogDeleteBtn");


    @Step("Add job titles")
    public void addTitle(){
        btnAdmin.click();
        menuJob.click();
        jobTitleBtn.click();
        btnAdd.click();
        titleField.sendKeys("Automation_QA");
        btnSave.click();

        menuJob.click();
        jobTitleBtn.click();
        btnAdd.click();
        titleField.sendKeys("QA_engineer");
        btnSave.click();

        menuJob.click();
        jobTitleBtn.click();
        btnAdd.click();
        titleField.sendKeys("QA_Automation engineer");
        btnSave.click();
    }

    @Step("Delete job titles")
    public void delTitle(){
        btnAdmin.click();
        menuJob.click();
        jobTitleBtn.click();
        selAutomation_QA.click();
        btnDel.click();
        btnDelOk.click();

        selQA_engineer.click();
        btnDel.click();
        btnDelOk.click();

        selQA_AutomationEn.click();
        btnDel.click();
        btnDelOk.click();
    }
}

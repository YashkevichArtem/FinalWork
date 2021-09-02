package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PIM extends AddUser{
    SelenideElement pimModule = $("#menu_pim_viewPimModule");
    SelenideElement empName = $("#empsearch_employee_name_empName");
    SelenideElement searchBtn = $("#searchBtn");
    SelenideElement slctEmp = $(By.xpath("//*[text()='0231']"));
    SelenideElement firstName = $("#personal_txtEmpFirstName");
    SelenideElement lastName = $("#personal_txtEmpLastName");
    SelenideElement empId = $("#personal_txtEmployeeId");

    SelenideElement contactDetails = $("a[href*=\"contactDetails\"]");
    SelenideElement workEmail = $("#contact_emp_work_email");

    SelenideElement jobDetails = $("a[href*=\"JobDetails/\"]");
    SelenideElement joinDate = $("#job_joined_date");
    SelenideElement editBtn = $("#btnSave");
    SelenideElement startDateBtn = $("#job_contract_start_date");
    SelenideElement endDateBtn = $("#job_contract_end_date");

    SelenideElement reportTo = $("a[href*=\"ReportToDetails/\"]");
    SelenideElement supName = $("td.supName");

    @Step("Check personal details")
    public void perDetails(){
        pimModule.click();
        empName.sendKeys("Nathan Elliot");
        searchBtn.click();
        slctEmp.click();
    }

    @Step("Check contact details")
    public void conDetails(){
        contactDetails.click();
    }

    //Если супервайзера кто-то уберёт, то выдаёт ошибку
//    @Step("Check report-to details")
//    public void repDetails(){
//        reportTo.click();
//    }

    @Step("Check job details")
    public void jobDetails(){
        jobDetails.click();
        editBtn.click();
        startDateBtn.setValue("2021-01-01");
        endDateBtn.setValue("2024-01-01");
        editBtn.click();
    }




}

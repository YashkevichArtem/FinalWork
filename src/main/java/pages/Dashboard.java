package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import junit.framework.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard extends AddUser{
    SelenideElement dashboardBtn = $("#menu_dashboard_index");
    SelenideElement titleH1 = $("div.head h1");
    SelenideElement quickLaunchPanel = $("#panel_resizable_0_0");
    SelenideElement employeePanel = $("#panel_resizable_1_0");
    SelenideElement legendPanel = $("#panel_resizable_1_1");
    SelenideElement requestsPanel = $("#panel_resizable_1_2");

    @Step("Check dashboard elements")
    public void dashboardElement(){
        dashboardBtn.click();
    }

}

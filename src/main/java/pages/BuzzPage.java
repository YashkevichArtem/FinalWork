package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuzzPage extends LoginPage {
    SelenideElement buzzBtn = $("#menu_buzz_viewBuzz");
    SelenideElement createPost = $("#createPost_content");
    SelenideElement postBtn = $("#postSubmitBtn");
    SelenideElement checkTextPost = $(By.xpath("//*[text()='Hello my friends.']"));

    @Step("Create post")
    public void buzzPageFields(){
        buzzBtn.click();
        createPost.sendKeys("Hello my friends.");
        postBtn.click();
    }
}

package pages;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PagesTest {
    @BeforeEach
    void setUp(){
        //Configuration.startMaximized = true;
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }

    @Order(1)
    @Test
    public void loginTest() throws IOException{
    LoginPage loginPage = new LoginPage();
    loginPage.openLoginPage();
    loginPage.login();
    loginPage.welcomeMessage.shouldBe(Condition.visible);
    Assertions.assertEquals("Dashboard", loginPage.welcomeMessage.getText());
    }

    @Order(2)
    @Test
    public void addUserTest() throws IOException {
        AddUser addUser = new AddUser();
        addUser.openLoginPage();
        addUser.login();
        addUser.add();
        Assertions.assertEquals("Successfully Saved", addUser.completeMessage.getText());
    }

    @Order(3)
    @Test
    public void addJobTitleTest() throws IOException {
        JobTitle jobTitle = new JobTitle();
        jobTitle.openLoginPage();
        jobTitle.login();
        jobTitle.addTitle();
        Assertions.assertEquals("Successfully Saved", jobTitle.completeMessage.getText());
    }

    @Order(4)
    @Test
    public void delJobTitleTest() throws IOException {
        JobTitle jobTitle = new JobTitle();
        jobTitle.openLoginPage();
        jobTitle.login();
        jobTitle.delTitle();
        Assertions.assertEquals("Successfully Deleted", jobTitle.completeMessage.getText());
    }

    @Order(5)
    @Test
    //Добавить кандидата без проверки.
    public void addNewCandidateTest() throws IOException {
        AddCandidate addCandidate = new AddCandidate();
        addCandidate.openLoginPage();
        addCandidate.login();
        addCandidate.addCandidate();
    }

    @Order(8)
    @Test
    public void assignLeaveTest() throws IOException {
        AssignLeave assLeave = new AssignLeave();
        assLeave.openLoginPage();
        assLeave.login();
        assLeave.assignLeave();
        Assertions.assertEquals("Successfully Assigned", assLeave.completeMessage.getText());
    }

    @Order(7)
    @Test
    public void dashboardCheckTest() throws IOException {
        Dashboard dashboard = new Dashboard();
        dashboard.openLoginPage();
        dashboard.login();
        dashboard.dashboardElement();
        Assertions.assertEquals("Dashboard", dashboard.titleH1.getText());
        Assertions.assertNotNull(dashboard.quickLaunchPanel);
        Assertions.assertEquals("Employee Distribution by Subunit", dashboard.employeePanel.getText());
        Assertions.assertNotNull(dashboard.legendPanel);
        Assertions.assertEquals("Pending Leave Requests", dashboard.requestsPanel.getText());
    }

    @Order(6)
    @Test
    public void checkPimDetailsTest() throws IOException{
        PIM pim = new PIM();
        pim.openLoginPage();
        pim.login();
        pim.perDetails();
        Assertions.assertEquals("Nathan", pim.firstName.getValue());
        Assertions.assertEquals("Elliot", pim.lastName.getValue());
        Assertions.assertEquals("0231", pim.empId.getValue());

        pim.conDetails();
        Assertions.assertEquals("nathan@osohrm.com", pim.workEmail.getValue());

        pim.jobDetails();
        Assertions.assertEquals("2018-10-03", pim.joinDate.getValue());

//        pim.repDetails();
//        Assertions.assertEquals("Linda Anderson", pim.supName.getText());
    }

    @Order(9)
    @Test
    public void logOutTest() throws IOException {
        LoginPage logPage = new LoginPage();
        logPage.openLoginPage();
        logPage.login();
        logPage.logOut();
        Assertions.assertEquals("LOGIN Panel", logPage.loginPanel.getText());
    }

    @Order(10)
    @Test
    public void buzzPageTest() throws IOException {
        BuzzPage buzz = new BuzzPage();
        buzz.openLoginPage();
        buzz.login();
        buzz.buzzPageFields();
        Assertions.assertEquals("Hello my friends.", buzz.checkTextPost.getValue());
    }

}
package com.cg.registration.stepdefinition;
/**
 * PackageName:com.cg.registration.stepdefinition
 * ClassName:RegistrationStepDefinition
 * Number of methods:41
 * @author gganesh
 */

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.bean.EducationalDetails;
import com.cg.registration.bean.PersonalDetails;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {

	private WebDriver driver;
	private PersonalDetails Details;
	private EducationalDetails educationalqualification;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver.exe");
	}

	@Given("^user is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver = new ChromeDriver();
		driver.get("C:\\Users\\gganesh\\Desktop\\WebPages_Set 3\\PersonalDetails.html");
		Details = PageFactory.initElements(driver, PersonalDetails.class);
		educationalqualification = PageFactory.initElements(driver, EducationalDetails.class);

	}

	@Then("^registration page should load with title 'Personal Details'$")
	public void registration_page_should_load_with_title_Personal_Details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedTitle="Personal Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@When("^user click on next without entering First Name$")
	public void user_click_on_next_without_entering_First_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setFirstName("");
		Details.clickNext();
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next without entering Last Name$")
	public void user_click_on_next_without_entering_Last_Name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setFirstName("Ganesh");
		Details.clickNext();
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next without entering Email$")
	public void user_click_on_next_without_entering_Email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setLastName("Gandem");
		Details.clickNext();
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next without entering Contact no\\.$")
	public void user_click_on_next_without_entering_Contact_no() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setEmail("ganesh@gmail.com");
		Details.clickNext();
	}

	@Then("^'Please fill the Contact no\\.' message should display$")
	public void please_fill_the_Contact_no_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next withot entering valid Contact no\\.$")
	public void user_click_on_next_withot_entering_valid_Contact_no() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setContactNo("970");
		Details.clickNext();
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next without entering 'address line one'$")
	public void user_click_on_next_without_entering_address_line_one() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setContactNo("3983504");
		Details.clickNext();
	}

	@Then("^'Please fill the address Line one' message should display$")
	public void please_fill_the_address_Line_one_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the address line 1";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}




	@When("^user click on next without entering 'address line two'$")
	public void user_click_on_next_without_entering_address_line_two() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setAddressLine1("Mavullamma Street");
		Details.clickNext();
	}

	@Then("^'Please fill the address Line two' message should display$")
	public void please_fill_the_address_Line_two_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill the address line 2";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}


	@When("^user click on next without selcting City$")
	public void user_click_on_next_without_selcting_City() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setAddressLine2("Gudiwada");
		Details.clickNext();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();


	}

	@When("^user click on next without selecting State$")
	public void user_click_on_next_without_selecting_State() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setCity("Hyderabad");
		Details.clickNext(); 
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on next by entering all valid details$")
	public void user_click_on_next_by_entering_all_valid_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Details.setState("Karnataka");
		Details.clickNext();

	}

	@Then("^'Personal details are validated and accepted successfully' message should display$")
	public void personal_details_are_validated_and_accepted_successfully_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Personal details are validated and accepted successfully.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
	}

	@Then("^navigates to the Educational Details page$")
	public void navigates_to_the_Educational_Details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss(); 
	}

	@When("^user is on Educational Details page$")
	public void user_is_on_Educational_Details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^registration page should load with tile 'Educational Details'$")
	public void registration_page_should_load_with_tile_Educational_Details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedTitle="Educational Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user click on 'Register Me' without selecting valid graduation$")
	public void user_click_on_Register_Me_without_selecting_valid_graduation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.registerMe();

	}

	@Then("^'Please select Graduation' message should display$")
	public void please_select_Graduation_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String expectedMessage="Please Select Graduation";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

	@When("^user click on 'Register Me' without entering percentage detail$")
	public void user_click_on_Register_Me_without_entering_percentage_detail() throws Throwable {
		educationalqualification.setGraduation("BTech");
		educationalqualification.registerMe();

	}

	@Then("^'Please fill Percentage Detail' message should display$")
	public void please_fill_Percentage_Detail_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill Percentage detail";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

	@When("^user click on 'Register Me' without entering passing year$")
	public void user_click_on_Register_Me_without_entering_passing_year() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.setPercentage("75");
		educationalqualification.registerMe();
	}

	@Then("^'Please fill Passing Year' message should display$")
	public void please_fill_Passing_Year_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill Passing Year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on 'Register Me' without entering project name$")
	public void user_click_on_Register_Me_without_entering_project_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.setPassingYear("2018");
		educationalqualification.registerMe();
	}

	@Then("^'Please fill Project Name' message should display$")
	public void please_fill_Project_Name_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill Project Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user click on 'Register Me' without selecting technologies used$")
	public void user_click_on_Register_Me_without_selecting_technologies_used() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.setProjectName("Java Web Project");
		educationalqualification.registerMe();
	}

	@Then("^'Please select Technologies Used' message should display$")
	public void please_select_Technologies_Used_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please Select Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

	@When("^user selects 'other' in Technologies used$")
	public void user_selects_other_in_Technologies_used() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.setTechnologiesUsed("Java");
		educationalqualification.setTechnologiesUsed("Other");


	}

	@Then("^user should fill other Technologies used$")
	public void user_should_fill_other_Technologies_used() throws Throwable {
		// Write code here that turns the phrase above into concrete actions


	}

	@When("^user click on 'Register Me' without entering technologies used$")
	public void user_click_on_Register_Me_without_entering_technologies_used() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		educationalqualification.registerMe();
	}

	@Then("^'Please fill other Technologies Used' message should display$")
	public void please_fill_other_Technologies_Used_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Please fill other Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();


	}

	@When("^user clicks on 'Register Me' button$")
	public void user_clicks_on_Register_Me_button() throws Throwable {
		educationalqualification.setOtherTechnologies("Selenium");
		educationalqualification.registerMe();
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^'Your Registration Has succesfully done Plz check your registered email for account activation link!!!' message should display$")
	public void your_Registration_Has_succesfully_done_Plz_check_your_registered_email_for_account_activation_link_message_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String expectedMessage="Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}


}





package com.cg.registration.bean;
/**
 * PakageName:com.cg.registration.bean
 * ClassName:PersonalDetails
 * @author gganesh
 */

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetails {
	@FindBy(how=How.ID, id="txtFirstName")
	private WebElement firstName;

	@FindBy(how=How.ID,id="txtLastName")
	private WebElement lastName;

	@FindBy(how=How.NAME, name="Email")
	private WebElement email;

	@FindBy(how=How.NAME, name="Phone")
	private WebElement contactNo;

	@FindBy(how=How.NAME, name="address1")
	private WebElement addressLine1;

	@FindBy(how=How.NAME, name="address2")
	private WebElement addressLine2;


	@FindBy(name="city")
	public List<WebElement> city;

	@FindBy(name="state")
	public List<WebElement> state;

	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[11]/td/a")
	public WebElement next;


	public PersonalDetails() {
		// TODO Auto-generated constructor stub
		super();
	}


	public String getFirstName() {
		return firstName.getAttribute("firstName");
	}


	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}


	public String getLastName() {
		return lastName.getAttribute("lastName");
	}


	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}


	public String getEmail() {
		return email.getAttribute("email");
	}


	public void setEmail(String email) {
		this.email.sendKeys(email);
	}


	public String getContactNo() {
		return contactNo.getAttribute("contactNo");
	}


	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}


	public String getAddressLine1() {
		return addressLine1.getAttribute("addressLine1");
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}


	public String getAddressLine2() {
		return addressLine2.getAttribute("addressLine2");
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}





	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
		select.selectByVisibleText(city);
	}



	public void setState(String state) {
		Select select = new Select(this.state.get(0));
		select.selectByVisibleText(state);
	}


	public void clickNext() {
		next.click();
	}
}
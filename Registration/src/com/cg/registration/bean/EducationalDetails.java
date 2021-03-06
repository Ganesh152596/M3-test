package com.cg.registration.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class EducationalDetails {
		
		@FindBy(how=How.NAME,name="graduation")
		private List<WebElement> graduation;
		
		@FindBy(how=How.NAME,name="percentage")
		private WebElement percentage;

		@FindBy(how=How.NAME,name="passingYear")
		private WebElement passingYear;
		
		@FindBy(how=How.NAME,name="projectName")
		private WebElement projectName;
		
		@FindBy(how=How.NAME,name="technologies")
		private List<WebElement> technologiesUsed;
		
		@FindBy(how=How.NAME,name="otherTechnologies")
		private WebElement otherTechnologies;
		
		@FindBy(how=How.ID,id="btnRegister")
		private WebElement registerMe;

		

		public void setGraduation(String graduation) {
			Select select = new Select(this.graduation.get(0));
		    select.selectByVisibleText(graduation);
		}

		public String getPercentage() {
			return percentage.getAttribute("percentage");
		}

		public void setPercentage(String percentage) {
			this.percentage.sendKeys(percentage);
		}

		public String getPassingYear() {
			return passingYear.getAttribute("passingYear");
		}

		public void setPassingYear(String passingYear) {
			this.passingYear.sendKeys(passingYear);
		}

		public String getProjectName() {
			return projectName.getAttribute("projectName");
		}

		public void setProjectName(String projectName) {
			this.projectName.sendKeys(projectName);
		}
		
		public void setTechnologiesUsed(String technologyUsed) {
			for(WebElement technology : technologiesUsed) {
				if(technology.getAttribute("value").contains(technologyUsed))
					technology.click();
			}	
		}

		public String getOtherTechnologies() {
			return otherTechnologies.getAttribute("otherTechnologies");
		}

		public void setOtherTechnologies(String otherTechnologies) {
			this.otherTechnologies.sendKeys(otherTechnologies);;
		}

		public void registerMe() {
			registerMe.click();
		}
		public EducationalDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

}

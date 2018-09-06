Feature:  StudentRegistration Form
Scenario: User is trying to Register without entering deatails

 Given user is on registration page
 Then registration page should load with title 'Personal Details'
 
  When user click on next without entering First Name
  Then 'Please fill the First Name' message should display
    
  When user click on next without entering Last Name
  Then 'Please fill the Last Name' message should display
    
  When user click on next without entering Email
  Then 'Please fill the Email' message should display
    
  When user click on next without entering Contact no.
  Then 'Please fill the Contact no.' message should display
    
  When user click on next withot entering valid Contact no. 
  Then 'Please enter valid Contact no.' message should display
  
  When user click on next without entering 'address line one'
  Then 'Please fill the address Line one' message should display
    
  When user click on next without entering 'address line two'
  Then 'Please fill the address Line two' message should display
    
  When user click on next without selcting City
  Then 'Please select city' message should display
    
  When user click on next without selecting State
  Then 'Please select state' message should display
  
  When user click on next by entering all valid details 
  Then 'Personal details are validated and accepted successfully' message should display
  And navigates to the Educational Details page
  
  When user is on Educational Details page
  Then registration page should load with tile 'Educational Details'
  
  When user click on 'Register Me' without selecting valid graduation
  Then 'Please select Graduation' message should display
  
  When user click on 'Register Me' without entering percentage detail
  Then 'Please fill Percentage Detail' message should display
  
   When user click on 'Register Me' without entering passing year
  Then 'Please fill Passing Year' message should display
  
  When user click on 'Register Me' without entering project name
  Then 'Please fill Project Name' message should display
  
  When user click on 'Register Me' without selecting technologies used
  Then 'Please select Technologies Used' message should display
  
  When user selects 'other' in Technologies used
  Then user should fill other Technologies used
  
  When user click on 'Register Me' without entering technologies used
  Then 'Please fill other Technologies Used' message should display
  
   When user clicks on 'Register Me' button
   Then 'Your Registration Has succesfully done Plz check your registered email for account activation link!!!' message should display

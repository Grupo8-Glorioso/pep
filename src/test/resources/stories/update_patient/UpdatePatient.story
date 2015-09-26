Create patient

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Update with invalid info
Given the user is managing a patient 
When the user updates a field with invalid info
Then they should see an error message informing that the info is invalid

Scenario: Update a patient’s demographic info
Given the user is managing a patient
When the user updates a demographic info
Then they should see the patient’s demographic info updated
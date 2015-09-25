Read patient

Meta:
@driver firefox 

Narrative:
In order to see a patient’s data
As a user
I want to search for the patient

Scenario: Consult existing patient
Given the user is on the patient search page
When the user fills and submits the form with information from desired patient
Then they should see the corresponding patient information 

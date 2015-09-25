Read patient

Meta:
@driver firefox 

Narrative:
In order to see a patient’s data
As a user
I want to search for the patient

Scenario: Consult information for 'Jose Silva'
Given the user is on the patient search page
When the user searches for 'Jose Silva'
Then they should see information for 'Jose Silva'

Scenario: Consult non-existing patient
Given the user is on the patient search page
When the user searches for a non-existing patient
Then they should see an message informing that the patient does not exist
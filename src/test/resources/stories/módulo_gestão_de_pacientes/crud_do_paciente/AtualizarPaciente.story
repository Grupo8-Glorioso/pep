Atualizar paciente

Meta:
@driver firefox 

Narrative:
In order to update a patient
As a receptionist
I want to update the demographic data

Scenario: Update a patient’s name
Given the user is managing a patient
When the user updates the field 'name' to 'Jose Silva'
Then they should see a confirmation of the patient’s new 'name' as 'Jose Silva'
Then the system record the audit 'updated'

Scenario: Update with invalid info
Given the user is managing a patient 
When the user updates a field with invalid info
Then they should see an error message informing that the info is invalid

Scenario: Update a patient’s demographic info
Given the user is managing a patient
When the user updates a demographic info
Then they should see the patient’s demographic info updated
Then the system record the audit 'updated'

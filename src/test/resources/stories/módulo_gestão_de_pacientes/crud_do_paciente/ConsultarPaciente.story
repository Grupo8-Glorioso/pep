Consultar Paciente

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
Then the system record the audit 'read'

Scenario: Consult non-existing patient
Given the user is on the patient search page
When the user searches for a non-existing patient
Then they should see a message informing that the patient does not exist

Scenario: Consult list of patients with a specific filter filter
Given the user is on the patient search page
When the user fills and submits the form with a certain criteria for filtering filter
Then they should see a list only of patients that satisfy the previous criteria
Then the system record the audit 'read'

|filter|
||
||
||
||
||
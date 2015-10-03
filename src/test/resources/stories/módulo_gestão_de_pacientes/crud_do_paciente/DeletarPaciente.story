Deletar paciente

Meta:
@driver firefox 

Narrative:
In order to prevent a patient from appearing in searches
As a doctor
I want to mark the patient as removed

Scenario: Remove a patient 'Jose Silva'
Given the doctor is managing a patient 'Jose Silva'
When the doctor chooses to remove the patient 'Jose Silva'
Then the patient is marked as removed and should not appears in searches
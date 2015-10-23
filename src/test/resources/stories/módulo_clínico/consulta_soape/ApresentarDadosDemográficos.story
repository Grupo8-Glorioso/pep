Apresentar dados demograficos de um paciente

Meta:
@driver firefox 

Narrative:
In order to see all demographic data of a patient
As a receptionist
I want to select a patient and see their demographic data

Scenario: See the demographic data of ‘Jose Silva’
Given the receptionist is on the patient search page
When she finds and selects ‘Jose Silva’
Then she should be directed to the page with the demographic data of ‘Jose Silva’

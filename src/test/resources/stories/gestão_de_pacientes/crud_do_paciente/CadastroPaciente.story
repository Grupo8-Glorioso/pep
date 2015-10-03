Cadastro de Paciente

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Create a patient 'Jose Silva'
Given the user is creating a patient
When the user enters the information from 'Jose Silva'
Then they should see a confirmation of the creation of 'Jose Silva'
Then the system record the audit 'created'
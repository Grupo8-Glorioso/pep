Create patient

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Create 'Jose Silva'
Given the user is creating a patient
When the user enters the information from 'Jose Silva'
Then they should see a confirmation of the creation of 'Jose Silva'

Scenario: Create a new patient
Given the user is managing patients
When the user creates a new patient
Then they should see the patient creation form
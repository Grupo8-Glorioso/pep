Create patient

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Create 'Jose Silva'
Given the user is on the patient creation form
When the user fills and submits the form with information from 'Jose Silva'
Then they should see a confirmation page with information from 'Jose Silva'

Scenario: Create a new patient
Given the user is on the patient management page
When the user starts to create a new patient
Then they should see the patient creation form
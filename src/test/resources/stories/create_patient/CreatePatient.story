Create patient

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Create 'Maria Josefina'
Given the user is on the patient creation form
When the user fills and submits the form with information from 'Maria Josefina'
Then they should see a confirmation page with information from 'Maria Josefina'

Scenario: Create a new patient
Given the user is on the patient management page
When the user starts to create a new patient
Then they should see the patient creation form

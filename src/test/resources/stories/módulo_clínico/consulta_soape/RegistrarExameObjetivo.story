Registrar informações do exame objetivo

Meta:
@driver firefox 

Narrative:
In order to register objective information about a patient
As a doctor
I want to physically examine the patient and register the results

Scenario: Physical examination of 'Jose Silva'
Given the doctor is physically examining 'Jose Silva'
When the doctor inserts the height, weight, temperature, blood pressure, heart rate, breathing rate, SatO2, SatCO2 and glycemia
Then the doctor should see a confirmation message

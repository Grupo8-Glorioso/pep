Registrar a evolução de um paciente

Meta:
@driver firefox 

Narrative:
In order to register a patient’s evolution
As a doctor
I want to register observations and comments

Scenario: Registering a patient’s evolution
Given the doctor is interviewing a returning patient
When the doctor inserts commentaries about the disease’s evolution
Then the doctor should see a confirmation page
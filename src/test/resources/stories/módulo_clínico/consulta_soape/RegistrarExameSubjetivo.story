Registrar informações do exame subjetivo

Meta:
@driver firefox 

Narrative:
In order to register subjective information about a patient
As a doctor
I want to interview the patient and register the results 

Scenario: Interview 'Jose Silva'
Given the doctor is interviewing 'Jose Silva'
When the doctor registers the main complaint, medical history, symptoms, habits, prosthesis and comments
Then the doctor should see a confirmation message

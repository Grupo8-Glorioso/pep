Registrar plano para um paciente

Meta:
@driver firefox 

Narrative:
In order to register the plan for a patient
As a doctor
I want to register the conduct for the patient

Scenario: Register plan for 'José Silva'
Given the doctor has determined a treatment plan for ‘Jose Silva’
When the doctor register the conduct for the patient and comments:
{transformer=FROM_LANDSPACE}
|conduct	|Repouso e observação. Solicitado sorologia para dengue.| 
|comments	||
Then the doctor should see a confirmation message

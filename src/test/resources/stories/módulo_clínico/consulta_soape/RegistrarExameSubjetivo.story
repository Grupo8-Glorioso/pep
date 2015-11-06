Registrar informações do exame subjetivo

Meta:
@driver firefox 

Narrative:
In order to register subjective information about a patient
As a doctor
I want to interview the patient and register the results 

Scenario: Interview 'Jose Silva'
Given the doctor is interviewing a patient
When the doctor registers the information given by the patient:
{transformer=FROM_LANDSCAPE}
|main_complaint										|Dores no corpo|
|history_of_present_illness							|Febre há 3 dias com mialgia e prostração|
|symptomatic_interrogation							||
|personal_and_family_history						|Câncer de pulmão (pai); AVC (mãe); esposa com dengue|
|lifestyle_socioeconomic_and_cultural_conditions	|Cessou tabagismo há 1 ano. Mosquito da dengue no seu bairro|
|orthotics_and_prosthetics							||
|comments											||
Then the doctor should see a confirmation message

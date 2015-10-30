Registrar informações do exame subjetivo

Meta:
@driver firefox 

Narrative:
In order to register subjective information about a patient
As a doctor
I want to interview the patient and register the results 

Scenario: Interview 'Jose Silva'
Given the doctor is interviewing 'Jose Silva'
When the doctor registers the information given by the patient:
{transformer=FROM_LANDSCAPE}
|main complaint										|Dores no corpo|
|history of present illness							|Febre há 3 dias com mialgia e prostração|
|symptomatic interrogation							||
|personal and family history						|Câncer de pulmão (pai); AVC (mãe); esposa com dengue|
|lifestyle, socioeconomic and cultural conditions	|Cessou tabagismo há 1 ano. Mosquito da dengue no seu bairro|
|orthotics and prosthetics							||
|comments											||
Then the doctor should see a confirmation message

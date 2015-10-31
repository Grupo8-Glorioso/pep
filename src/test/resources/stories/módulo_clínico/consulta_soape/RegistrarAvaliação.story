Registrar a avaliação do medico sobre um paciente

Meta:
@driver firefox 

Narrative:
In order to register the evaluation of a patient
As a doctor
I want register the given diagnosis after doing the objective and subjective examinations

Scenario: Register diagnosis of 'José Silva'
Given the doctor has made the subjective and objective examinations of 'José Silva'
When he registers the diagnosis, CID 10 code and comments:
{transformer=FROM_LANDSPACE}
|code CID 10			|A90|
|hipotesis diagnostic	|Dengue|
|definitive diagnosis	||
|comments				||
Then the doctor should see a confirmation message

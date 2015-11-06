Registrar informações do exame objetivo

Meta:
@driver firefox 

Narrative:
In order to register objective information about a patient
As a doctor
I want to physically examine the patient and register the results

Scenario: Physical examination of 'Jose Silva'
Given the doctor is physically examining a patient
When the doctor inserts test data:
{transformer=FROM_LANDSCAPE}
|height					|1,63m|								|
|weight					|70kg|
|temperature			|37,7ºC|
|blood_pressure			|135/90mmHg|
|heart_rate				|72/min|		
|breathing_rate			|17/min|
|satO2					|96%|
|satCO2 				||
|glycemia				|88mg/dL|
|comments				|Mialgia generalizada. Febrícula|
Then the doctor should see a confirmation message

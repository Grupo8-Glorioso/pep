Cadastro de Paciente

Meta:
@driver firefox 

Narrative:
In order to create a new patient
As a receptionist
I want to register the demographic data

Scenario: Create a patient 'Jose Silva'
Given the user is creating a patient
When the user enters and submits the patient information: 
{transformer=FROM_LANDSCAPE}
|name           |Jose Silva|
|birth_date     |07/16/1957|
|marital_status |divorciado|
|phone	        |2121212121|
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |1234567|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		|12312312311|
Then they should see a confirmation of the creation of 'Jose Silva'
Then the system record the audit 'created'

Scenario: Create an already existing patient 'rg'
Given the user is creating a patient
When the user enters the 'rg' from an existing patient
Then they should see an error message informing a duplicate
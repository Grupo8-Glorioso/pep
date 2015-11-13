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
<<<<<<< HEAD
|marital_status |Divorciado(a)|
|phone	        |19997493026|
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |13085733|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		|42828164850|
=======
|marital_status |divorciado|
|phone	        |12345678901|
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |12345678|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		|12345678901|
>>>>>>> 316347cd49d6e3fe9a8f92ecf29bcd8b5a9d7046
|gender			|Masculino|
Then they should see a confirmation of the creation of: 
{transformer=FROM_LANDSCAPE}
|name           |Jose Silva|
|birth_date     |07/16/1957|
<<<<<<< HEAD
|marital_status |Divorciado(a)|
|phone	        |19997493026|
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |13085733|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		|42828164850|
=======
|marital_status |divorciado|
|phone	        |12345678901|
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |12345678|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		|12345678901|
>>>>>>> 316347cd49d6e3fe9a8f92ecf29bcd8b5a9d7046
|gender			|Masculino|

Scenario: Create an already existing patient 'Jose Silva'
Given the user is creating a patient
When the user enters and submits the patient information: 
{transformer=FROM_LANDSCAPE}
|name           |Jose Silva|
|birth_date     |07/16/1957|
|marital_status |Divorciado(a)|
|phone	        ||
|address		|Rua 21, casa 2|
|neighborhood   |Villa 21|
|zipcode        |13085733|
|birth_place    |Osasco SP|
|father_name    |Carlos Silva|
|mother_name    |Maria Joana da Silva|
|cpf    		||
|gender			|Masculino|
Then they should see an error message informing a duplicate 'Já existe esse usuário'
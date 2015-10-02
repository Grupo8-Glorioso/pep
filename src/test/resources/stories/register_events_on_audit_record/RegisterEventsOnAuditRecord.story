Register events on audit record

Meta:
@driver firefox 

Narrative:
In order to maintain an audit record
As an administrator
I Want to register the date, time, event type, user id, patient id (when applicable) of an event

Scenario: Register event on audit record
Given that a CRUD event was triggered by the user
When the user checks the audit record
Then they should see the previous triggered event

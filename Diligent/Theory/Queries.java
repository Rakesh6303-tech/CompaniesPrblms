                                                      ------------: PROJECT RELEATED QUESTIONS :-------------
 --------------------------------------------------------------------------------------------------------------------------------------------------------------------                            
1) How do you update an employee’s email in your project using Postman?
-----------------------------------------------------------------
  ### ✅ **Answer:**
“In my project, we had an API endpoint to update employee details.
//To update an employee’s email using Postman, 
I used the **PATCH** method since we were updating only one field right.
For example, I used the endpoint:
```
http://localhost:8080/api/employees/5
(Here, 5 is the employee ID.)

In Postman, I selected the **PATCH** method, added the header:
`Content-Type: application/json`
and in the body (raw JSON), I entered:

```json
{
  "email": "newemail@example.com"
}
```
After clicking **Send**, the API returned a success message.
To verify, I sent a **GET** request for the same employee ID and confirmed that the email was updated correctly.”
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
👨‍💼 Interviewer: What happens in the backend when you send that(EMAIL) request?
👨‍🎓 You: the request from Postman, it reaches the backend controller,
  for example:
// @PatchMapping("/employees/{id}")
// public ResponseEntity<Employee> updateEmail(@PathVariable Long id, @RequestBody Map<String, String> request) {
//     String newEmail = request.get("email");
//     Employee updatedEmployee = employeeService.updateEmail(id, newEmail);
//     return ResponseEntity.ok(updatedEmployee);
}
The controller passes the new email to the service layer, which updates the record in the database using the repository. 
  Finally, the updated employee object is returned in the response.
                               (or)
“The request goes to the controller, which calls the service layer.
The service updates the record in the database using the repository, and then returns the updated employee details.”
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
👨‍💼 Difference Between Patch & Put                                |                                 🔹 PUT (Full Update)
                                                                 |
                                                                 |                    Purpose: Replaces the entire resource (all fields).
    🔹 PATCH (Partial Update)                                    |
Purpose: Updates only specific fields in the resource.           |                  Typically used when you want to update the whole record.
Other fields remain unchanged.
                                                                |                     Ex : Http 
                                                                |                          PUT /api/employees/5
                                                                |                    Body : Json  
                                                                |                           {
                                                                 |                                 "name": "Rakesh Doddi",
                                                                 |                                  "email": "rakesh@example.com",
                                                                 |                                  "designation": "Developer"
                                                                 |                            }
  Ex: Http                                                       |
   PATCH /api/employees/5                                        |
                                                                 |
  Body :                                                         | 
   Json                                                          |
  {                                                              |
  "email": "newemail@example.com"
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3)  “When I add new data, for example, adding a new employee through Postman, here’s what happens:
I send a POST request to the API endpoint like
http://localhost:8080/api/employees
with the employee details in JSON format in the request body.
Once I click Send, the request goes to the backend server where it’s handled by the controller method that’s mapped to POST.
The controller receives the data and passes it to the service layer, which contains the business logic.
The service then calls the repository, which interacts with the database.
The repository executes an INSERT operation and saves the new employee record in the database.
After the record is saved successfully, the database sends a confirmation back to the repository, then to the service, then to the controller.
Finally, the controller sends a response back to Postman with a success message and the newly created data, usually with the status code 201 Created.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  ✅ Interview Question:
     What happens when you delete an employee (or any data) in your project using Postman?
      When I want to delete data, for example deleting an employee, 
        I send a DELETE request from Postman to the API endpoint that includes the employee ID.
For example:
DELETE http://localhost:8080/api/employees/6
Once I click Send, the request goes to the backend server.
The controller method mapped with @DeleteMapping receives the request.
The controller then calls the service layer, which passes the request to the repository.
The repository executes a DELETE query in the database — it finds the employee by ID and removes that record.
After deletion, the backend sends a response back to Postman confirming that the record was deleted successfully, 
                   usually with status code 200 OK or 204 No Content.”
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
  ✅ Interview Question:
“How do you get employee data in your project using Postman?”
or
“What happens when you send a GET request to fetch data?”
💬 
“When I want to get employee data, I use the GET method in Postman.
For example, if I want to fetch all employees, I send a request to:
GET http://localhost:8080/api/employees
If I want to fetch a single employee by ID, I use:
GET http://localhost:8080/api/employees/6
When I click Send, the request goes to the backend controller that handles GET requests.
The controller calls the service layer, which retrieves the data from the repository.
The repository runs a SELECT query in the database and sends the result back.
Finally, the controller returns the data as a JSON response in Postman with status 200 OK.
- - --------------------------------------------------------------: Queries On TechStack :----------------------------------------------------------------------------------

  1) Explain about Oops?
  2) Explain about Normalization?
  3) 1nf,2NF, 3NF
  4) Difference Between Encapsulation & Abstraction?
  5) Explain Indexes ?
  6) RESTAPI?
  
  

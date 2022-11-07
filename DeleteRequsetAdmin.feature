
Feature: user able to delete by admin_id
Scenario: user wants able to delete the data by using id
When user wants to delete the requset by using URI "http://localhost:8080/admin/15" 
Then verify the status line as "HTTP/1.1 200 "
And verify the status code as 200

Feature: User able to get admin by id
Scenario: User wants to fetch the data in Admin
When user wants to fetch the data by using URI as "http://localhost:8080/admin/16"
Then verify the status line "HTTP/1.1 200 "
And Verify the status code 200
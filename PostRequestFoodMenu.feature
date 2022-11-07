
Feature: user able to save the Food Menu
Scenario: user wants to save the Food Menu by using admin id
Given user wants to sava  data by using admin id
When user wants to save the data by using URI "http://localhost:8080/foodMenus"
Then verify the statusLine as "HTTP/1.1 201 " 
And Verify the status code as 201
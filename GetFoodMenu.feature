
Feature: User able to get FoodMenu by id
Scenario: User wants to fetch the data in FoodMenu
When user wants to find the data by using URI as "http://localhost:8080/foodMenus/2"
Then Verify the status line as "HTTP/1.1 200 "
And Verify the Status Code is 200


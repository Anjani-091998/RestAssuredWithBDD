
Feature: User able to delete FoodMenu by id
Scenario: user wants to delete the data by using FoodMenu by id
When User wants to delete  data by using URI as "http://localhost:8080/foodMenus/3"
Then Verfiy the Status line "HTTP/1.1 200 "
And  verfiy the status code as 200

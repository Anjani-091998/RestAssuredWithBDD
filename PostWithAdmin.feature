@tag
Feature: Admin Controller
Scenario: User wants to create the data in Admin
Given user wants to provide the data in admin
When user wants to create the data by using URI as "http://localhost:8080/admin"
Then verify the Status code is 201


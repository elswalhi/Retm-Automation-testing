Feature: Admin can create subscriber


Scenario: Admin can create subscriber with valid Data
  Given Admin navigate to Subscribers page
  And Admin click on Add subscriber
  And Admin Enter subscriber Name as "Automation Subscriber 7"
  And Admin Enter subscriber Email as "automation7@email.com"
  And Admin Enter subscriber Password as "Hero@1287"
  And Admin Enter subscriber Phone as "01554696357"
  And Admin click save
  Then subscriber Added

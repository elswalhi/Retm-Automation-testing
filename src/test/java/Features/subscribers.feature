Feature: Admin can create subscriber


Scenario: Admin can create subscriber with valid Data
  Given Admin navigate to Subscribers page
  And Admin click on Add subscriber
  And Admin Enter subscriber Name as "Automation Subscriber 8"
  And Admin Enter subscriber Email as "automation8@email.com"
  And Admin Enter subscriber Password as "Hero@1288"
  And Admin Enter subscriber Phone as "01554696358"
  And Admin click save
  Then subscriber Added

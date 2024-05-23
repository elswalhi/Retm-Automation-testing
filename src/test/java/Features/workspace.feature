
Feature: admin can Crude workspace
  @workspace1
  Scenario: admin can create workspace
   Given Admin log in dashboard
   When Admin click on create workspace button
   And Enter workspace Name as "Test Automation Workspace12"
   And click on next button
   And click on invite late
   And click on complete later
   Then Workspace Created and user can see "Test Automation Workspace12" on active workspace

  Scenario: admin can delete workspace
    Given Admin navigate to workspaces page
    And Admin click more button
    And Admin Click on delete workspace
    And Admin click on confirm delete
    Then workspace deleted

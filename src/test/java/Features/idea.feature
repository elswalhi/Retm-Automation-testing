@idea
Feature: User Crud Create Idea

Scenario: user can create idea
  Given user navigate to idea page
  And user click on add idea
  And user enter text as "test automation"
  And user add picture
  And user click save
  Then idea created

  Scenario: user can edit idea
    Given user navigate to idea page
    And user click on idea
    And user click on more button
    And user click on edit
    And user edit text as "test auto edit"
    And user add picture
    And user click save
    Then idea created

  Scenario: user can make comment in idea And delete it
    Given user navigate to idea page
    And user click on idea
    And user enter comment as "test comment"
    And user click send
    Then comment posted
    Then user click on comment more button
     And click on delete comment
     Then comment deleted

  Scenario: user can delete idea
    Given user navigate to idea page
    And user click on idea
    And user click on more button
    And user click delete
    And user click confirm delete
    Then idea deleted

  Scenario: user can Approve idea
    Given user navigate to idea page
    And user click on add idea
    And user enter text as "test automation"
    And user add picture
    And user click save
    Then idea created
    Given user navigate to idea page
    And user click on idea
    And user click on Approve
    Then idea Approved

  Scenario: user can Reject idea
    Given user navigate to idea page
    And user click on add idea
    And user enter text as "test automation"
    And user add picture
    And user click save
    Then idea created
    Then idea created
    Given user navigate to idea page
    And user click on idea
    And user click on Reject
    Then idea Rejected

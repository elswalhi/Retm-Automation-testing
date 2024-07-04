
Feature: User Crud Create post

  Scenario: user can create post as draft
    Given user navigate to post page
    And user click on add post
    And user enter post text as "test automation"
    And user add picture
    And user click save draft
    Then post created

  Scenario: user can edit post
    Given user navigate to post page
    And user click on post
    And user click on post more button
    And user click on post edit
    And user edit post text as "test auto edit"
    And user add picture
    And user click save
    Then post created

  Scenario: user can make comment in post And delete it
    Given user navigate to post page
    And user click on post
    And user enter comment as "test comment"
    And user click send
    Then comment posted
    Then user click on post comment more button
    And click on delete comment
    Then comment deleted

  Scenario: user can delete post
    Given user navigate to post page
    And user click on post
    And user click on more button
    And user click delete
    And user click confirm delete
    Then post deleted

  Scenario: user can Approve post
    Given user navigate to post page
    And user click on add post
    And user enter post text as "test automation Approve"
    And user add picture
    And user click save draft
    Then post created
    Given user navigate to post page
    And user click on post
    And user click on post Approve
    Then post Approved

  Scenario: user can request revision post
    Given user navigate to post page
    And user click on add post
    And user enter post text as "test automation Rev"
    And user add picture
    And user click save
    Then post created
    Then post created
    Given user navigate to post page
    And user click on post
    And user click on Request Revision
    And user enter feedback as "this is feedback"
    And user click on save feedback
    Then post revision requested

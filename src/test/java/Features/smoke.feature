Feature: user can navigate to all pages without Errors
  Scenario: user can navigate to idea page
    Given user navigate to idea page
    Then user can see just an idea or create idea

  Scenario: user can navigate to innovation page
    Given user navigate to post page
    Then user can see just an innovation or create post

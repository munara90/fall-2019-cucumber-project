
@smoke @lib-132 #navigation @wip
Feature: Page navigation links
  # login as librarian
   # click on the users link
   # verify page Users

  # login as librarian
  # click on the Books link
  # verify page Books

  # shift+option--> to see the list of the classes that I have

  #all the common steps we put in Background
   Background:
     Given I am on the login page
     And I login as a librarian

  @db @wip
  Scenario: Go to users page
    When I click on "Users" link
    Then "Users" should be displayed

  @wip
    Scenario: Go to books page
      When I click on "Books" link
      Then "Books" page should be displayed



  Scenario: Go to dashboard page
    And I click on "Books" link
    And I click on "Dashboard" link
    Then "Dashboard" page should be displayed


  #@smoke--> tag is used for running only specified Scenario
@smoke @login @staff

Feature: Login
  As a user, I should be able to Login

  @librarian @staff @wip
  Scenario:Login as an librarian
     Given I am on the login page
      When I login as librarian user
      Then dashboard should be displayed
  @student
  Scenario: Login as a student
    Given I am on the login page
    When I login as a student
    Then dashboard should be displayed
  @admin
  Scenario: Login as a admin
    Given I am on the login page
    When I login as a admin
    Then dashboard should be displayed

    @admin @staff
  Scenario: Login as a admin
    Given I am on the login page
    When I login as a admin
    Then dashboard should be displayed

    #this is comment



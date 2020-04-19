#control+space--> to get the options of already used
Feature: Login with parameters

  @wip
  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "ibrarian11@library"
    And I enter password "I61FFPPf"
    And click the sign in button
    Then dashboard should be displayed

  #"ibrarian11@library"--> is parameter as a String
   # @wip work in progress
  #if i change order, I can use single quotes
  # I can change values and still will print
  #dont count on the name, count on order, order matters


  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username 'ibrarian12@library'
    And I enter password 'AOYKYTMJ'
    And click the sign in button
    Then dashboard should be displayed
    And there should be 23 users


    Scenario: login as librarian  same line
      Given I am on the login page
      When I login using 'ibrarian12@library' and 'AOYKYTMJ'
      Then dashboard should be displayed
      And there should be 23 'users'

      #IQ: how can I write a step which involve String and # ?
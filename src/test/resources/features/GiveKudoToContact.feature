@RegressionAndroid @ContactTest1
Feature: Like a user requests find a specific Contact

 #Scenario 1
  Scenario Outline: The user requests find a specific Contact
    Given I login with my "<username>" and my "<password>"
      And I'm on my profile page
    When I click on Contacts Tab
      And I click on find a Contact
      And type the next Contact "<contact>"
      And click over the field of this Contact "<contact>"
    Then I should see the Profile User found
    When I click in Kudos Button
    Then I should see the Kudos Page
    When I click in select an action
      And select a Action as "<action>"
    Then I should see the Action "<action>" selected in a first field
    When I click in select a Tag
      And I select a Tag "<tag>"
    Then I should see the Tag "<tag>" selected in the second field
    When I click in Write a comment
      And I write a comment "<comment>"
      And I click in Done
    Then I should see the comment "<comment>" wrote in in a last field
      And I check the button done now is enable
    When I click Done button
    Then I should see the message of action done successfully
      And I back on Pages to Logout of APP
      And I finally Logout of App

    Examples:

      |  username  | password | contact                   | comment                                | action                         | tag           |
      | jexebio    | test     | Juan Bryan Estrada Acosta |this is a comment of automation test    | Help with process improvements | android       |
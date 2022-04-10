 Feature: Application Login
      
      Scenario: Home page default login
      Given user is on login page
      When user login with username "ram" and password "ram1234"
      Then homepage is populated
      And cards displayed "true"
      
      Scenario: Home page default login
      Given user is on login page
      When user login with username "jin" and password "jin1234"
      Then homepage is populated
      And cards displayed "false"

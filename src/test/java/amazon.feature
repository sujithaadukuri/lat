Feature: To check the features of amazon website

  Scenario: logging in to amazon
    Given  user enters the url of the browser
    Then amazon homepage will be displayed
    When user enters the login credentials and click on login button
    Then user account should be signed in

    Scenario: product should be added to the cart
      Given user click on category menu
      When user select the women fashion submenu
      And Western menu in women fashion
      Then western wear page should be displayed
      When user select top brands check box
      Then user select a product and add to cart
      And user goes to cart page
      When clicking on delete button
      Then product should be removed from the cart
      When user click on account dropdown and click on sign in button
      Then user should sign out from amazon

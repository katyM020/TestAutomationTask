Feature: Feature to test search functionality - positive

  @search
  Scenario Outline: the user shall be able to search for an item by entering it in the search bar
    Given user is on home page
    When clicks on the search bar
    And user enters <item>
    And hits enter
    And select the product <index>
    And choose product quantity which is <quantity>
    And click on add to cart button
    Then confirmation message will be displayed

    Examples: 
      | item        | index | quantity |
      | smart watch |     5 |        2 |

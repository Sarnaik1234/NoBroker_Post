Feature: To Post your Property on nobroker site

  Background: 
    Given User is logged in

  @Post
  Scenario: User clicks on For Property owners to post property ad
  When User clicks on For Property owners from home page
  And  User redirects to new tab and clicks on only active button
  And  User clicks on post now option
  And  User select the city from dropdown
  And  User clicks on Start Posting button
  Then User should get Property details form
  
  
  @Property
  Scenario Outline: User fill up property details form for posting the property
  When User selects Apartment Type  from dropdown options
  And User selects BHK Type  from dropdown options
  And User selects Floor from dropdown options
  And User selects Total Floor  from dropdown options
  And User selects  Property Age from dropdown options
  And User enters "<Build Up Area>"
  And User clicks save &continue
  Then User should redirect to Locality details
  
  Examples:
  | Build Up Area |
  |          2085 |
  
  @Locality
  Scenario: User fill up locality details form for posting the property,
  When User enter the locality name and selects one from the dropdown
  |godrej|
  And User enter landmark
  |petroleum|
  And User Zoom and out on the map
  And User clicks save& continue
  Then User should redirect to Rental details form
  
  @Renovation
  Scenario Outline: User Book Free Home Inspection for home renovation.
    When User clicks on menu tab
    And User clciks on painting and cleaning option
    And User clicks on home renovation
    And User enter <Name> and <Phoneno>
    And User selects city
    And User clicks on Get Free Qoute
    Then User recieves a confirmation message

    Examples: 
      | Name           | Phoneno |
      | Apurva Sarnaik |   8080191093 |

    @FAQs
    Scenario: User clicks on FAQs
    When User scroll down on home page
    And User clicks on Careers option and redirects to career tab
    And User comes back to home page and clicks on FAQs option
    Then User should redirect to FAQs tab

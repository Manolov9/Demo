Feature: Open gComposer and navigate SVG Masks
  Navigate, regenerate and save SVG Masks for sport

  @complete
  @menbaseball
  Scenario: Navigate, generate and save SVG Masks for sport
    Given  Navigate to svg masks "http://dev.embodee.com/gcomposer/svgmasks/747226"
    When  Verify generate and save masks
    Then  Log out

  @complete
  Scenario: Navigate, generate and save SVG Masks for sport
    Given  Navigate to svg masks "http://dev.embodee.com/gcomposer/svgmasks/747221"
    When  Verify generate and save masks
    Then  Log out


  @complete
  Scenario: Navigate, generate and save SVG Masks for sport
    Given  Navigate to svg masks "http://dev.embodee.com/gcomposer/svgmasks/747222"
    When  Verify generate and save masks
    Then  Log out

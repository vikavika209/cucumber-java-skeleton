Feature: Belly

  Background:
    Given мой живот пустой

  @smoke
  Scenario Outline: несколько печененок
    Given я съел <qty> печененки
    When я жду <hours> час
    Then мой живот журчит

    Examples:
      | qty  | hours |
      | 50   | 1     |
      | 1    | 2     |
      | 100  | 3     |



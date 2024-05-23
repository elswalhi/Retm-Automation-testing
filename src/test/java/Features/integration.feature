Feature:  integration with x
@integration
  Scenario: user make integration with x
  Given user have workspace
  And user click on x icon
  And user enter x username as "swalhiitsme@gmail.com"
  And user enter x password as "Zero@1280"
  And user click sign in
  Then x integrated


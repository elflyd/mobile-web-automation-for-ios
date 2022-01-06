Feature: Forgot Password

  @e-mail
  Scenario: Forgot Password with sms
    Given Open https://beta.misli.com in Safari browser
    And Click on Daxil Ol button
    And Click on Şifrəni unutmusunuz?
    When Enter phoneNumber and birthDate
    And Click on DAVAM ET
    Then Check email/sms pop-up
    And Click e-mail button
    And Click on DAVAM ET 2
    Then Check result of Code Sent





  @sms
  Scenario: Forgot Password with sms
    Given Open https://beta.misli.com in Safari browser
    And Click on Daxil Ol button
    And Click on Şifrəni unutmusunuz?
    When Enter phoneNumber and birthDate
    And Click on DAVAM ET
    Then Check email/sms pop-up
    And Click sms button
    And Click on DAVAM ET 2
    Then Check result of Code Sent
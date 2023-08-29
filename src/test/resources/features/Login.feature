Feature: Login Test

  Background:
    Given Kullanıcı login sayfasına gider.
  @wip
  Scenario: Kullanıcı geçerli datalarla login olur
    When Kullanıcı geçerli verilerle login olmalıdır.
    Then Kullanıcı login olduğunda "Menü" tabini gördüğünü verify eder.
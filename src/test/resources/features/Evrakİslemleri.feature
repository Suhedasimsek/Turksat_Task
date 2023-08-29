
Feature: Belgenet Evrak Oluşturma Testi
  # Agile story : Kullanıcı tek imzacılı resmi yazı oluşturabilmelidir.

  Background:
    Given Kullanıcı login sayfasına gider.
    And Kullanıcı geçerli verilerle login olmalıdır.

@evrak
  Scenario: Tek imzacılı resmi yazı oluşturma
    When Kullanıcı evrak oluşrurur.
    And  Bilgileri tabındaki zorunlu alanları doldurur.
    And  Edit tabındaki gerekli alanları doldurur.
    And  Ekleri tabından dosya ekler.
    And  Hazırladığı evrakı imzalar.
    Then İmzaladıklarım listesinde "Konu: Fatura Hakkında Şikayetler" konulu evragın düştüğünü görür.
    And  Teslim alınmayı bekleyenler listesine "Konu: Fatura Hakkında Şikayetler" konulu evragın düştüğünü görür.


package com.belgenet.step_definitions;

import com.belgenet.pages.EvrakIslemleri;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Evrakİslemleri_Stepdefs {
    EvrakIslemleri evrakIslemleri=new EvrakIslemleri();
    @When("Kullanıcı evrak oluşrurur.")
    public void kullanıcıEvrakOluşrurur() {
        evrakIslemleri.evrakOlustur_Mtd();
    }

    @And("Bilgileri tabındaki zorunlu alanları doldurur.")
    public void bilgileriTabındakiZorunluAlanlarıDoldurur() {
        evrakIslemleri.bilgileriDoldur_Mtd();
        
    }

    @And("Edit tabındaki gerekli alanları doldurur.")
    public void editTabındakiGerekliAlanlarıDoldurur() {
        evrakIslemleri.editTabi_Mtd();
        
    }

    @And("Ekleri tabından dosya ekler.")
    public void ekleriTabındanDosyaEkler() {
        evrakIslemleri.dosyaEkle_Mtd();
        
    }

    @And("Hazırladığı evrakı imzalar.")
    public void hazırladığıEvrakıImzalar() {
        evrakIslemleri.imzala_Mtd();
        
    }

    @Then("İmzaladıklarım listesinde {string} konulu evragın düştüğünü görür.")
    public void i̇mzaladıklarımListesindeKonuluEvragınDüştüğünüGörür(String evrakKonu) {
        evrakIslemleri.verifyImzaladiklarim(evrakKonu);
    }

    @And("Teslim alınmayı bekleyenler listesine {string} konulu evragın düştüğünü görür.")
    public void teslimAlınmayıBekleyenlerListesineKonuluEvragınDüştüğünüGörür(String evrakKonu) {
        evrakIslemleri.verifyTeslimAlinmayiBekleyenler(evrakKonu);
    }
}

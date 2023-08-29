package com.belgenet.pages;

import com.belgenet.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class EvrakIslemleri extends BasePage {

    @FindBy(xpath = "//span[text()='Evrak İşlemleri']")
    public WebElement evrakIslemleri_loc;
    @FindBy(xpath = "//span[@class='topMenuIcons evrakOlustur']")
    public WebElement evrakOlustur_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:j_idt6027")
    public WebElement konuKoduCarpi_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:treeButton")
    public WebElement konuKoduSec_loc;
    @FindBy(xpath = "(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[2]")
    public WebElement konuKabloHizmetleri_loc;
    @FindBy(xpath = "//li[@id='yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:lovTree:2_0']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
    public WebElement konuKabloMusteriHizmetleri_loc;
    @FindBy(xpath = "//li[@id='yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:lovTree:2_0_0']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
    public WebElement konuAboneIslemleri_loc;
    @FindBy(xpath = "//li[@id='yeniGidenEvrakForm:evrakBilgileriList:1:konuKoduLov:lovTree:2_0_0_0']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
    public WebElement konuSikayetler_loc;
    @FindBy(xpath = "(//span[text()='Kablo Hizmetleri Müşteri İlişkileri | Abone İşlemleri | Şikayetler '])[1]")
    public WebElement konuFaturaSikayetler_loc;
    @FindBy(xpath = "//textarea[@id='yeniGidenEvrakForm:evrakBilgileriList:3:konuTextArea']")
    public WebElement konu_loc;
    @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-icon ui-c tree-icon'])[2]")
    public WebElement kaldirilacakKlasorlerSec_loc;
    @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-icon ui-c tree-icon'])[3]")
    public WebElement bilgiSec_loc;
    @FindBy(xpath = "(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[1]")
    public WebElement bilgiGenelMudurluk_loc;
    @FindBy(xpath = "//li[@id='yeniGidenEvrakForm:evrakBilgileriList:17:bilgiLov:lovTree:0']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
    public WebElement bilgiBirim_loc;
    @FindBy(xpath = "(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[6]")
    public WebElement bilgiEdevlet_loc;
    @FindBy(xpath = "(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[6]")
    public WebElement bilgiBilisim2_loc;
    @FindBy(xpath = "(//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e'])[6]")
    public WebElement bilgiBean_loc;
    @FindBy(xpath = "(//span[text()='GENEL MÜDÜRLÜK MAKAMI  |  E-DEVLET VE BİLİŞİM HİZMETLERİ GENEL MÜDÜR YARDIMCISI  |  BİLİŞİM  İŞ GELİŞTİRME VE PROJE YÖNETİMİ DİREKTÖRLÜĞÜ  |  BEAM BİRİM  |  TEST DEPARTMENT'])[1]")
    public WebElement bilgiTestDepartment_loc;
    @FindBy(xpath = "(//span[@class='ui-button-icon-left ui-icon ui-c tree-icon'])[4]")
    public WebElement geregiSec_loc;
    @FindBy(xpath = "//li[@id='yeniGidenEvrakForm:evrakBilgileriList:18:geregiLov:lovTree:0']//span[@class='ui-tree-toggler ui-icon ui-icon-triangle-1-e']")
    public WebElement geregiBirim_loc;
    @FindBy(xpath = "(//span[text()='GENEL MÜDÜRLÜK MAKAMI'])[4]")
    public WebElement geregiGenelMudurluk_loc;
    @FindBy(xpath = "(//span[text()='[Seri] '])[2]")
    public WebElement turksatAs_loc;
    @FindBy(xpath = "//select[@name='yeniGidenEvrakForm:evrakBilgileriList:5:evrakTuruCombo']")
    public WebElement evrakTuru_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:8:evrakDili")
    public WebElement evrakDili_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:9:guvenlikKodu")
    public WebElement gizlilikDerecesi_loc;
    @FindBy(xpath = " //label[text()=' Normal']")
    public WebElement kanunKapsamTipi_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:15:ivedilik")
    public WebElement ivedilik_loc;
    @FindBy(xpath = "//span[@class='ui-button-icon-left ui-icon ui-c add-icon']")
    public WebElement onayAkisi_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakBilgileriList:21:akisAdimLov:LovSecilenTable:0:selectOneMenu")
    public WebElement paraflama_loc;
    @FindBy(xpath = "//span[text()='Kullan']")
    public WebElement kullanButton_loc;
    @FindBy(xpath = "//span[text()='Editör']")
    public WebElement editor_loc;
    @FindBy(xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[2]")
    public WebElement editInput_loc;
    @FindBy(xpath = "//span[text()='Ekleri']")
    public WebElement ekleriTabi_loc;
    @FindBy(xpath = "//input[@id='yeniGidenEvrakForm:evrakEkTabView:fileUploadButtonA_input']")
    public WebElement dosyaEkle_loc;
    @FindBy(xpath = "(//span[text()='Ekle'])[1]")
    public WebElement ekleBttn_loc;
    @FindBy(id = "yeniGidenEvrakForm:evrakEkTabView:dosyaAciklama")
    public WebElement ekMetni_loc;
    @FindBy(xpath = "//span[@class='ui-button-icon-left ui-icon ui-c kaydet']")
    public WebElement kaydetButton_loc;
    @FindBy(xpath = "//span[@class='ui-button-icon-left ui-icon ui-c imzala']")
    public WebElement imzalaButton_loc;
    @FindBy(xpath = "(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[2]")
    public WebElement sImza_loc;
    @FindBy(xpath = "(//span[text()='İmzala'])[2]")
    public WebElement imzala_loc;
    @FindBy(xpath = "(//span[text()='Evet'])[5]")
    public WebElement evet_loc;
    @FindBy(xpath = "//h3[contains(text(),'İşlem Yaptıklarım')]")
    public WebElement islemYaptiklarim_loc;
    @FindBy(xpath = "//span[text()='İmzaladıklarım'][1]")
    public WebElement imzaladiklarim_loc;
    @FindBy(xpath = "(//h3[@class='ui-inbox-satir1'])[1]")
    public WebElement konuAdiImza_loc;
    @FindBy(xpath = "//h3[contains(text(),'Birim Evrakları')]")
    public WebElement birimEvraklari_loc;
    @FindBy(xpath = "//span[contains(text(),'Teslim Alınmayı')]")
    public WebElement teslimAlinmayiBekleyenler_loc;
    @FindBy(xpath = "(//h3[@class='ui-inbox-satir1'])[1]")
    public WebElement konuAdiTeslim_loc;

    public void evrakOlustur_Mtd() {
        evrakIslemleri_loc.click();
        evrakOlustur_loc.click();
    }

    public void bilgileriDoldur_Mtd() {
        Actions actions = new Actions(Driver.get());
        clickWithJS(konuKoduCarpi_loc);
        clickWithJS(konuKoduSec_loc);
        clickWithJS(konuKabloHizmetleri_loc);
        clickWithJS(konuKabloMusteriHizmetleri_loc);
        clickWithJS(konuAboneIslemleri_loc);
        clickWithJS(konuSikayetler_loc);
        actions.doubleClick(konuFaturaSikayetler_loc).perform();
        waitFor(2);
        konu_loc.click();
        konu_loc.clear();
        konu_loc.sendKeys("Fatura Hakkında Şikayetler");
        waitFor(2);
        clickWithJS(kaldirilacakKlasorlerSec_loc);
        waitFor(3);
        actions.doubleClick(turksatAs_loc).perform();
        Select evrakTuru = new Select(evrakTuru_loc);
        evrakTuru.selectByVisibleText("Dilekçe");
        Select evrakDili = new Select(evrakDili_loc);
        evrakDili.selectByVisibleText("Türkçe");
        Select gizlilikDerecesi = new Select(gizlilikDerecesi_loc);
        gizlilikDerecesi.selectByVisibleText("Hizmete Özel");
        clickWithJS(kanunKapsamTipi_loc);
        Select ivedilik = new Select(ivedilik_loc);
        ivedilik.selectByVisibleText("Normal");

        clickWithJS(bilgiSec_loc);
        clickWithJS(bilgiBirim_loc);
        waitFor(2);
        clickWithJS(bilgiGenelMudurluk_loc);
        waitFor(2);
        clickWithJS(bilgiEdevlet_loc);
        waitFor(2);
        clickWithJS(bilgiBilisim2_loc);
        waitFor(2);
        clickWithJS(bilgiBean_loc);
        waitFor(2);
        scrolldownWithJS(bilgiTestDepartment_loc);
        actions.doubleClick(bilgiTestDepartment_loc).perform();
        clickWithJS(geregiSec_loc);
        clickWithJS(geregiBirim_loc);
        actions.doubleClick(geregiGenelMudurluk_loc).perform();
        scrolldownWithJS(onayAkisi_loc);
        clickWithJS(onayAkisi_loc);
        waitFor(2);
        paraflama_loc.click();
        Select imzacı = new Select(paraflama_loc);
        imzacı.selectByVisibleText("İmzalama");
        kullanButton_loc.click();
    }

    public void editTabi_Mtd() {
        clickWithJS(editor_loc);
        waitFor(3);
        new Actions(Driver.get())
                .sendKeys(editInput_loc, "Fatura hakkında yapılan şikayet değerlendirilmiştir.")
                .perform();


    }

    public void dosyaEkle_Mtd() {
        Actions actions = new Actions(Driver.get());
        clickWithJS(ekleriTabi_loc);
        actions.sendKeys(ekMetni_loc, "Ek-1(Fatura Şikayeti)")
                .perform();

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/Fatura Şikayet.docx";
        String fullPath = projectPath + "/" + filePath;
        dosyaEkle_loc.sendKeys(fullPath);
        waitFor(3);
        clickWithJS(ekleBttn_loc);
        clickWithJS(kaydetButton_loc);


    }

    public void imzala_Mtd() {
        waitFor(3);
        clickWithJS(imzalaButton_loc);
        clickWithJS(sImza_loc);
        String windowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(windowHandle)) {
                Driver.get().switchTo().window(handle);
                Driver.get().close();
            }
        }

        Driver.get().switchTo().window(windowHandle);

        waitFor(3);
        clickWithJS(imzala_loc);
        waitFor(2);
        clickWithJS(evet_loc);


    }

    public void verifyImzaladiklarim(String expectedText) {
        clickWithJS(islemYaptiklarim_loc);
        scrolldownWithJS(imzaladiklarim_loc);
        clickWithJS(imzaladiklarim_loc);
        String actualText = konuAdiImza_loc.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void verifyTeslimAlinmayiBekleyenler(String expectedText) {

        clickWithJS(birimEvraklari_loc);
        scrolldownWithJS(teslimAlinmayiBekleyenler_loc);
        clickWithJS(teslimAlinmayiBekleyenler_loc);
        String actualText = konuAdiTeslim_loc.getText();
        Assert.assertEquals(expectedText, actualText);
    }

}

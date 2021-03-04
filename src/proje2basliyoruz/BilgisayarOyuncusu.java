/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2basliyoruz;

/**
 *
 * @author sevkikaragol
 */
public class BilgisayarOyuncusu extends Oyuncu{
    private String kartListesi;

    public BilgisayarOyuncusu(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public BilgisayarOyuncusu() {
    }
    

    public String getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(String kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    void kartSec() {
       /*Oyuncu sınıfında bulunan kartSec() metotu override edilecektir. Bilgisayar random olarak
       aldığı 3 adet kart arasından yine random kart seçerek ortaya koyacaktır.*/
    }
    
}

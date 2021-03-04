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
public class InsanOyuncusu extends Oyuncu{
private String kartListesi;

    public InsanOyuncusu(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public InsanOyuncusu() {
    }

    public String getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(String kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    void kartSec() {
       /*Oyuncu sınıfında bulunan kartSec() metotu override edilecektir. Kullanıcı random olarak
aldığı kartlar arasından kendi istediği kartı seçerek ortaya koyacaktır.*/
    }
    
}

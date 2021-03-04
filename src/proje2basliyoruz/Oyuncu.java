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
public abstract class Oyuncu {
    private String oyuncuID;
    private String oyuncuAdi;
    private int Skor;

    public Oyuncu(String oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }

    public Oyuncu() {
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = this.Skor+Skor;
    }
    
    public void kartListesi(){
    
}
    public void skorGoster(){
        
    }
    abstract void kartSec();
}

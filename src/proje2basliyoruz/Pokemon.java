/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2basliyoruz;

import javax.swing.ImageIcon;


/**
 *
 * @author sevkikaragol
 */
public class Pokemon {
    
    private String pokemonID;
    private String pokemonAdi;
    private String pokemonTip;
    
    private int hasarPuani;
    private ImageIcon icon;
    private int kontrol1;
    private int kontrol2;
    

    public Pokemon(String pokemonID, String pokemonAdi, String pokemonTip) {
        
        this.pokemonID = pokemonID;
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
        this.kontrol1=0;
        this.kontrol2=0;
    }

    public Pokemon() {
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public int getKontrol1() {
        return kontrol1;
    }

    public void setKontrol1(int kontrol1) {
        this.kontrol1 = 1;
    }

    public int getKontrol2() {
        return kontrol2;
    }

    public void setKontrol2(int kontrol2) {
        this.kontrol2 = 1;
    }
    

    public int getHasarPuani() {
        return hasarPuani;
    }
    
    public String getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(String pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }
    public void hasarPuaniGoster(){
        
    }
    //random atarken aynı sayıları atmasın diye.
    public boolean kullanildiMi(int a){
        if(a==1){
            System.out.println("Kullanıldı");
            return true;
        }
        else
            return false;
    }
    //oynarken,oynanan kart oyun dışı kalsın diye.
    public boolean kullanildiMi2(int a){
        if(a==1){
            System.out.println("Kullanıldı");
            return true;
        }
        else
            return false;
    }
    
    

}

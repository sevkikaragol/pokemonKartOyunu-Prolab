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
public class Psyduck extends Pokemon {
    private int hasarPuani=20;
    private ImageIcon icon=new ImageIcon("src\\pokeimg\\psyduck.jpg");
    private int kontrol1;
    private int kontrol2;

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    

    public Psyduck(String pokemonID, String pokemonAdi, String pokemonTip) {
        super(pokemonID, pokemonAdi, pokemonTip);
    }

    public Psyduck() {
    }

    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    @Override
    public void hasarPuaniGoster() {
       System.out.println(this.hasarPuani);
    }
    
    @Override
    public boolean kullanildiMi2(int a){
        if(a==1){
            System.out.println("Kullanıldı");
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean kullanildiMi(int a){
        if(a==1){
            System.out.println("Kullanıldı");
            return true;
        }
        else
            return false;
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
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class UjiBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola uji = new Bola();
        System.out.println("======Hitung Luas dan Volume Bola=======");
        uji.setJariJari(7);
        uji.showDiameter();
        uji.showLuasPermukaan();
        uji.showVolume();
        System.out.println();
        uji.setJariJari(21);
        uji.showDiameter();
        uji.showLuasPermukaan();
        uji.showVolume();
    }
    
}

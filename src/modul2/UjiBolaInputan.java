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
public class UjiBolaInputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaInputan uji = new BolaInputan();
        System.out.println("======Hitung Luas dan Volume Bola=======");
        uji.setJariJari();
        uji.showDiameter();
        uji.showLuasPermukaan();
        uji.showVolume();
        System.out.println();
        uji.setJariJari();
        uji.showDiameter();
        uji.showLuasPermukaan();
        uji.showVolume();
    }
    
}

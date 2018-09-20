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
public class Bola {
    private double jariJari;
    private final double pi = 3.14;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
        System.out.println("Jari-jari           = "+jariJari);
    }
    public void showDiameter(){
        double temp;
        temp = 2*jariJari;
        System.out.println("Diameter bola       = "+temp);
    }
    public void showLuasPermukaan(){
        double temp;
        temp = 4*pi*jariJari*jariJari;
        System.out.println("Luas Permukaan bola = " +temp);
    }
    public void showVolume(){
        double temp;
        temp = 4*pi*jariJari*jariJari*jariJari/3;
        System.out.println("Volume Bola        =  "+temp);
    }
    
}

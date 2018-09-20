/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class UjiBus4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus4 bus = new Bus4(55);
        Scanner scan = new Scanner(System.in);
        
        
        bus.addPenumpang(5);
        bus.berat(100);
        bus.cetak();
        
        bus.addPenumpang(10);
        bus.berat(150);
        bus.cetak();
        
        System.out.print("Insert Password   : "); int password = scan.nextInt();
        if(password==25){
            System.out.println("Password Benar");
            bus.addPenumpang(25);
            bus.berat(1000);
            bus.cetak();
        }else{
            System.out.println("Password Salah");
        }
        
        
    }
  
}
    
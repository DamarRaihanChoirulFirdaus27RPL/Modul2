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
public class UjiBus3 {

    public static void main(String[] arg) {
        
        Bus3 bus = new Bus3(5);
        getPenumpang();
        getPenumpang();
        bus.cetakpenumpang();
        bus.addPenumpang(2);
        bus.cetakpenumpang();
        bus.addPenumpang(1);
        bus.cetakpenumpang();
        bus.addPenumpang(2);
        bus.cetakpenumpang();
        bus.addPenumpang(2);
        bus.cetakpenumpang();
    }
    
    public static int getPenumpang(){
        Bus3 bus = new Bus3(5);
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert Password   : "); int password = scan.nextInt();
        if(password==25){
            System.out.println("Password Benar");
            bus.addPenumpang(24);
        }else{
            System.out.println("Password Salah");
        }
        return 0;
       
        
        
    }
}


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
public class UjiBus2 {
public static void main(String[] arg) {
       Bus2 busBesar = new Bus2(40);
       busBesar.cetak();
       busBesar.addPenumpang(15);
       busBesar.cetak();
       busBesar.addPenumpang(5);
       busBesar.addPenumpang(26);
       busBesar.cetak();
    }
    
}

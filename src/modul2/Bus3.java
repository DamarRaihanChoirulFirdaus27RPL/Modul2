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
public class Bus3 {
    Scanner scan = new Scanner(System.in);
    public int penumpang;
    public int maxPenumpang;

    public Bus3(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang) {
        int temp = this.penumpang + penumpang;
        if(temp>maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
        }
    }
   public void cetakpenumpang(){
       System.out.println("Penumpang bus sekarang                    = "+penumpang);
       System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
   }

}

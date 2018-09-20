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
public class Bus4 {

    private double penumpang;
    private final double maxPenumpang;
    private double berat ;
    private double average;
    private final double maxBerat = 1500;

    public Bus4(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(double penumpang) {
        double temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }
    public void berat(double berat){
          
          double temp;
          temp = this.berat + berat;
          this.berat = temp;      
          average = temp/penumpang;
          
      }
      public void cetak(){
       System.out.println("Penumpang bus sekarang                    = "+penumpang);
       System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
       System.out.println("Berat Penumpang bus sekarang              = "+berat+" kg ");
       System.out.println("rata-rata berat penumpang bus sekarang    = "+average+" kg");
            
      }
      
 
      }



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrencitakip;

import java.util.Scanner;

/**
 *
 * @author Alp Arslan
 */
public class OgrenciTakip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Sinav 1 Puan Giriniz");
        double s1 = s.nextDouble();
        System.out.println("Sinav 2 Puan Giriniz");
        double s2 = s.nextDouble();
        System.out.println("Sozlu Puan Giriniz");
        double soz = s.nextDouble();
        System.out.println("Proje Puan Giriniz");
        double pro = s.nextDouble();
        System.out.println("Devamsizlik Sayisi Giriniz");
        double dev = s.nextDouble();
        double puan = (s1 + s2 + soz + pro) / 4;
        System.out.println("puan " +puan);
        int sonuc = 0;

        if (dev > 2) {
            sonuc = 1;
        } else if (puan > 0 && puan < 45) {
            sonuc = 1;
        } else if (puan > 45 && puan < 55) {
            sonuc = 2;
        } else if (puan > 55 && puan < 70) {
            sonuc = 3;
        } else if (puan > 70 && puan < 85) {
            sonuc = 4;
        } else if (puan > 85 && puan < 101) {
            sonuc = 5;
        }
        System.out.println(sonuc);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomo4uts;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
       
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.setLuasAlas(1);
        limas1.setLuasSelubung(1);
        limas1.setTinggi(1);
        System.out.println("tampilkan Output: ");
        System.out.println("Limas segi empat dengan luas alas : " + 1 + ", luas selubung limas : " + 1 + " dan tinggi : " + 1
                + ". Luasnya : " + String.format("%.2f", limas1.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas1.getVolume()));

        System.out.println("tampilkan Output: ");
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        System.out.println("Limas segi empat dengan luas alas : " + 30 + ", luas selubung limas : " + 40 + " dan tinggi : " + 50
                + ". Luasnya : " + String.format("%.1f", limas2.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas2.getVolume()));

        System.out.println("tampilkan Output: ");
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);
        System.out.println("Limas segi empat dengan luas alas : " + 25 + ", luas selubung limas : " + 35 + " dan tinggi : " + 45
                + ". Luasnya : " + String.format("%.2f", limas3.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.1f", limas3.getVolume()));
    }
}

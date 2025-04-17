/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspraktikum;

import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        Scanner inputObjk = new Scanner(System.in);

        int bilanganPositif = 0;
        int bilanganNegatif = 0;
        double total = 0;
        int jumlahInput = 0;

        System.out.println("memasukan nilai 0 akan keluar dari program");

        while (true) {
            int angka = inputObjk.nextInt();

            if (angka == 0) {
                break;
            }

            total += angka;
            jumlahInput++;

            if (angka > 0) {
                bilanganPositif++;
            } else {
                bilanganNegatif++;
            }
        }

        if (jumlahInput == 0) {
            System.out.println("Tidak ada input selain nol.");
        } else {
            double rataRata = total / jumlahInput;

            System.out.println("Jumlah bilangan positif adalah " + bilanganPositif);
            System.out.println("Jumlah bilangan negatif adalah " + bilanganNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata - rata " + rataRata);
        }

        inputObjk.close();
    }
}

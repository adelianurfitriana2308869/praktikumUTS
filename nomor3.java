/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspraktikum;

import java.util.Scanner;
public class nomor3 {
     public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;  
            n /= 10;        
        }

        return sum;
    }

    
    public static void main(String[] args) {
        Scanner inputObjk = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long bilanganBulat = inputObjk.nextLong();

        int hasilJumlah = sumDigits(bilanganBulat);
        System.out.println("Jumlah semua digit adalah: " + hasil);

        inputObjk.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomo4uts;

/**
 *
 * @author acer
 */
public class LimasSegiEmpat {
    
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Konstruktor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Metode menghitung volume
    public double getVolume() {
        return (1.0 / 3.0) * luasAlas * tinggi;
    }

    // Metode menghitung luas permukaan
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Setter
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Favian R.H
 */
public class Kalkulator {
    private String nama;
    private double beratBadan;
    private double tinggiBadan;
    
    public Kalkulator(String nama, double beratBadan, double tinggiBadan){
        if(nama.isBlank() || nama == null){
            throw new IllegalArgumentException("Masukkan nama");
        }
        if(beratBadan <= 0 || tinggiBadan <= 0){
            throw new IllegalArgumentException("Berat atau tinggi badan bukan nilai yang valid");
        }
        this.nama = nama;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan / 100;
    }
    public String getNama(){
        return nama;
    }
    public double hitungBMI(){
        return beratBadan/(tinggiBadan * tinggiBadan);
    }
}

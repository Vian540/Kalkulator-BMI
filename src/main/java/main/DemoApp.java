/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.Kalkulator;

/**
 *
 * @author Favian R.H
 */
public class DemoApp {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator("Vian", 60.7 , 188.7);
        System.out.println(kalkulator.getNama());
        System.out.println(kalkulator.hitungBMI());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan48.kalkulator;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);

        System.out.printf("VALUE 1 = %.1f%n", kalkulator.getValue1());
        System.out.printf("VALUE 2 = %.1f%n", kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.printf("Result Add is = %.1f%n", kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.printf("Result Minus is = %.1f%n", kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.printf("Result Multiplication is = %.1f%n", kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.printf("Result Division is = %.1f%n", kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}

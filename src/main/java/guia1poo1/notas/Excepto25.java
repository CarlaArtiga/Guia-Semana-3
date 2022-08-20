/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1poo1.notas;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Excepto25 {

    public static void main(String[] args) {
        System.out.println("***Programa que imprime del numero 1 al 30 excepto el 25***");
        
        System.out.println("");
        int i;
        for (i = 1; i <= 30; i++) {

            if (i != 25) {
                System.out.print(i + " ");
            }

        }

    }
}

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
public class TablaMultiplicar {
    public static void main(String[] args) {
        System.out.println("***Programa que imprime la tabla de multiplicar de un numero***");
        int num = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        num = reader.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(num + " x " + (i+1) + " = " + (num*(i+1)) );
        }
    }
}

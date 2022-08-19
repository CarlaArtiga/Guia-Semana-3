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
public class Coordenadas {
    public static void main(String[] args) {
        System.out.println("***Programa de coordenadas***");
        Scanner reader = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Escriba el numero del eje x: ");
        x = reader.nextInt();
        System.out.print("Escriba el numero del eje y: ");
        y = reader.nextInt();
        System.out.println("Sus coordenadas son: " + "(" + x + "," + y + ")");
        
        if(x>=0 && y >=0){
            //Cuadrante uno
            System.out.println("Cuadrante uno");
        }
        else if(x<0 && y > 0){
            //cuadrante 2
            System.out.println("Cuadrante dos");
        }
        else if (x < 0 && y < 0){
            //cuadrante 3
            System.out.println("Cuadrante tres");
        }
        else if (x > 0 && y <0){
            //cuadrante 4
            System.out.println("Cuadrante cuatro");
        }
    }
}

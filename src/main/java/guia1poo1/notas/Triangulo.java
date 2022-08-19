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
public class Triangulo {
     public static void main(String[] args) {
         System.out.println("***Programa que evalua Triangulos***");
         Scanner reader = new Scanner(System.in);
         float a=0,b=0,c=0;
         int conT = 0;
         int CantEqui = 0, CantIso = 0, CantEsca = 0;
         System.out.print("Ingrese la cantidad de traingulos a evaluar: ");
         conT = reader.nextInt();
         for (int i = 0;i<conT;i++){
             System.out.println("");
             System.out.println("Triangulo " + (i+1));
             System.out.println("");
             System.out.print("Digite el primer lado: ");
             a = reader.nextInt();
             System.out.print("Digite el segundo lado: ");
             b = reader.nextInt();
             System.out.print("Digite el tercer lado: ");
             c = reader.nextInt();
             if(a == b && b == c && c == a){
                 System.out.println("Triangulo Equilatero");
                 CantEqui = CantEqui + 1;
             }
             else if (a!=c && a==b && b!=c){
                 System.out.println("Triangulo Isoceles");
                 CantIso = CantIso + 1;
             
             }
             else if (a!=b && a!=c && b!=c){
                 System.out.println("Triangulo Escaleno");
                 CantEsca = CantEsca + 1;
             }
         }
         System.out.println("Cantidad de triangulos equilateros: " + CantEqui);
         System.out.println("Cantidad de triangulos isoceles: " + CantIso);
         System.out.println("Cantidad de triangulos escalenos: " + CantEsca);
         
     
     }
}

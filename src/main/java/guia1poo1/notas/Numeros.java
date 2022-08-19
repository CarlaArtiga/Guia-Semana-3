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
public class Numeros {
    public static void main(String[] args) {
        System.out.println("***Programa que evalua diez numeros***");
        Scanner reader = new Scanner(System.in);
        int num = 0, ContNeg = 0, ContPos =0, ContQuinc = 0, ContPares = 0;
        for(int i = 0; i<10;i++){
           
            System.out.println("");
            System.out.print("Numero " + (i+1)+": ");
            num = reader.nextInt();
            
            if(num > 0 ){
                System.out.println("Positivo");
                ContPos = ContPos +1;
            }
            else{
                System.out.println("Negativo");
                ContNeg = ContNeg + 1;
            }
            if (num > 0 && num%2==0){
                System.out.println("Es par");
                ContPares = ContPares +1;
               
            }
            if (num > 0 && num%15==0 ){
                System.out.println("Multiplo de 15");
                ContQuinc = ContQuinc + 1;
                
            }
            
            
        }
        System.out.println("");
        System.out.println("Numeros postivos: " + ContPos);
        System.out.println("Numeros negativos: " + ContNeg);
        System.out.println("Numeros Pares: " + ContPares);
        System.out.println("Numeros multiplos de 15: " + ContQuinc);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author yeico
 */
public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numeroUno, numeroDos, numeroTres, numeroMayor, numeroMenor;

        System.out.println("Ingrese el primer número: ");
        numeroUno = input.nextFloat();

        System.out.println("Ingrese el segundo número: ");
        numeroDos = input.nextFloat();
        
        

        if (numeroUno > numeroDos) {
            numeroMayor = numeroUno;
            numeroMenor = numeroDos;
        } else if (numeroDos > numeroUno) {
            numeroMayor = numeroDos;
            numeroMenor = numeroUno;
        } else {
            numeroMayor = numeroDos;
            numeroMenor = numeroUno;
        }
        
        System.out.println("Ingrese el tercer número: ");
        numeroTres = input.nextFloat();
        
        if(numeroTres < numeroMenor){
            numeroMenor = numeroTres;
        }else if(numeroTres > numeroMayor){
            numeroMayor = numeroTres;
        }

        System.out.println("El número mayor es " + numeroMayor + " y el menor es " + numeroMenor);
    }

}

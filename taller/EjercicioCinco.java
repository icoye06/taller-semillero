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
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota;
        String nombre, notaLetra;

        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = input.nextLine();

        System.out.println(nombre + ", ingrese su notal final");
        nota = input.nextFloat();
        
        if(nota >= 0 && nota < 60){
            notaLetra = "F";
        }else if(nota >= 60 && nota < 70){
            notaLetra = "D";
        }else if(nota >= 70 && nota < 80){
            notaLetra = "C";
        }else if(nota >= 80 && nota < 90){
            notaLetra = "B";
        }else if(nota >= 90 && nota < 100){
            notaLetra = "A";
        }else{
            System.out.println("La nota está fuera de rango");
            return;
        }

        String resultado = (nota > 75) ? "aprobado" : "reprobado";

        System.out.println(nombre + ", usted ha " + resultado + " el curso con nota de: " + notaLetra);
    }
}

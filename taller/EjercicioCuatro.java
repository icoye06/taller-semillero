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
public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota;
        String nombre;

        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = input.nextLine();

        System.out.println(nombre + ", ingrese su notal final");
        nota = input.nextFloat();

        String resultado = (nota > 75) ? "aprobado" : "reprobado";

        System.out.println(nombre + ", usted ha " + resultado + " el curso con nota de: " + nota);
    }
}

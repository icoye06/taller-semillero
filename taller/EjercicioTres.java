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
public class EjercicioTres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        int horasSemana = 168;
        int horasDia = 24;
        int resultadoSemanas;
        int resultadoDias;
        int resultadoHoras;

        System.out.println("Ingrese el número de horas: ");
        horas = input.nextInt();
        input.close();

        if (((float) horas / horasSemana) % 1 == 0) {
            resultadoSemanas = horas / horasSemana;
            System.out.println("Semanas: " + resultadoSemanas + ", Días: 0, Horas: 0");
        } else {
            resultadoSemanas = (horas / horasSemana);
            int auxiliarDias = horas - (resultadoSemanas * horasSemana);
            resultadoDias = auxiliarDias / horasDia;
            resultadoHoras = auxiliarDias - (resultadoDias * horasDia);
            System.out.println("Semanas: " + resultadoSemanas + ", Días: " + resultadoDias + ", Horas: " + resultadoHoras);
        }
    }
}

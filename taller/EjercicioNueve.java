package taller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yeico
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        String dia;
        ArrayList<String> dias = new ArrayList<>(Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el día sin tildes y en minúscula");
        dia = input.nextLine();
        input.close();

        if (!dias.contains(dia)) {
            System.out.println("El día no existe");
            return;
        }

        switch (dia) {
            case "sabado":
                System.out.println("NO es un día laboral");
                break;
            case "domingo":
                System.out.println("NO es un día laboral");
                break;
            default:
                System.out.println("Es un día laboral");
        }

    }
}

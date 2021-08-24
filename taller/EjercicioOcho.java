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
public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, num3, num4, num5;

        System.out.println("Ingrese 5 numeros a continuación:");

        System.out.print("Ingrese el valor de N1: ");
        num1 = sc.nextFloat();

        System.out.print("Ingrese el valor de N2: ");
        num2 = sc.nextFloat();

        System.out.print("Ingrese el valor de N3: ");
        num3 = sc.nextFloat();

        System.out.print("Ingrese el valor de N4: ");
        num4 = sc.nextFloat();

        System.out.print("Ingrese el valor de N5: ");
        num5 = sc.nextFloat();

        sc.close();

        if (num1 < num2) {
            num1 += num2;
            num2 = num1 - num2;
            num1 -= num2;
        }
        if (num1 < num3) {
            num1 += num3;
            num3 = num1 - num3;
            num1 -= num3;
        }
        if (num1 < num4) {
            num1 += num4;
            num4 = num1 - num4;
            num1 -= num4;
        }
        if (num1 < num5) {
            num1 += num5;
            num5 = num1 - num5;
            num1 -= num5;
        }

        if (num2 < num3) {
            num2 += num3;
            num3 = num2 - num3;
            num2 -= num3;
        }
        if (num2 < num4) {
            num2 += num4;
            num4 = num2 - num4;
            num2 -= num4;
        }
        if (num2 < num5) {
            num2 += num5;
            num5 = num2 - num5;
            num2 -= num5;
        }

        if (num3 < num4) {
            num3 += num4;
            num4 = num3 - num4;
            num3 -= num4;
        }
        if (num3 < num5) {
            num3 += num5;
            num5 = num3 - num5;
            num3 -= num5;
        }

        if (num4 < num5) {
            num4 += num5;
            num5 = num4 - num5;
            num4 -= num5;
        }

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
    }

}

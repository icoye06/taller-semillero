/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yeico
 */
public class EjericicioUno {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer número: ");
        float numeroUno = Float.parseFloat(br.readLine());
        System.out.println("Ingrese el segundo número: ");
        float numeroDos = Float.parseFloat(br.readLine());

        System.out.println("Los número ingresados fueron: " + numeroUno + " y " + numeroDos
                + "\n La suma es: " + (numeroUno + numeroDos)
                + "\n La multiplicación es: " + (numeroUno * numeroDos)
                + "\n La resta es de " + numeroUno + " y " + numeroDos + " es: " + (numeroUno - numeroDos)
                + "\n La división de " + numeroUno + " y " + numeroDos + " es: " + (numeroUno / numeroDos)
                + "\n El módulo de " + numeroUno + " mod " + numeroDos + " es: " + (numeroUno % numeroDos)
        );
    }
}

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
public class EjercicioDos {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el número: ");
        int numero = Integer.parseInt(br.readLine());
        
        String resultado = (numero / 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
    }
}

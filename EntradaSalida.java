/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectonach;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {

    static String pedirPalabra() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la palabra");
        String palabra=sc.nextLine();
        return palabra;

    }

    static int pedirNumeroLetras() {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Introduzca el número de letras");
        try
        {
        n=sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Debe ser un entero");
            pedirNumeroLetras();
        }
        return n;
    }
    
}

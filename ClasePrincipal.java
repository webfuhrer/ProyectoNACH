/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectonach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        String texto=AccesoFichero.devolverTexto();
        String texto_limpio=tratarTexto(texto);
        String palabra_usuario=EntradaSalida.pedirPalabra();
        
        int n_letras=EntradaSalida.pedirNumeroLetras();
        String terminacion_palabra_usuario=
                palabra_usuario.substring(palabra_usuario.length()-n_letras);
        String[] lista_palabras=texto.split(" ");
        for (String palabra:lista_palabras )
        {
            if(palabra.length()>=n_letras)
            {
                int longitud=palabra.length();//PERRO
                String terminacion_palabra=palabra.substring(longitud-n_letras);
                if (terminacion_palabra.equals(terminacion_palabra_usuario))
                {
                    System.out.println(palabra);
                }
            }
            
        }
        
    }

    private static String tratarTexto(String texto) {
        char[] caracteres_eliminables={'"', '.', ',', ';', '?', '¿', '!','¡', ':'};
        for(char x: caracteres_eliminables)
        {
            texto=texto.replace(String.valueOf(x),"" );
        }
        //
        return texto.toLowerCase();
    }

    private static Map<String, Integer> rellenarMapa(String texto_limpio) {
        Map<String, Integer> mapa_palabras=new HashMap();
        String[] lista_palabras=texto_limpio.split(" ");
        for (String p:lista_palabras)
        {
            if(mapa_palabras.containsKey(p))
            {
                Integer n =mapa_palabras.get(p);
                n++;
                mapa_palabras.replace(p, n);
            }
            else
            {
                mapa_palabras.put(p, 1);
            }
        }
        return mapa_palabras;
    }
}
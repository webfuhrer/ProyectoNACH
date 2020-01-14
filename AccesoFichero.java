/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectonach;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class AccesoFichero {

    static String devolverTexto()  {
        String texto_total="";
        try {
            InputStreamReader lector=new InputStreamReader(new FileInputStream("C:\\texto\\texto.txt"),  "Cp1252") ;
            BufferedReader br=new BufferedReader(lector);
            
            String linea=br.readLine();
            
            while(linea!=null)
            {
                texto_total=texto_total+" "+linea;
                linea=br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto_total;
    }
    
}
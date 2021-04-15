/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciruclos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alfredo.valero
 */
public class CalcularCirculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Circulitos circulo = new Circulitos( 37, 43, 2.5 );
        String salida = "La coordenada X es: " + circulo.obtenerX() +
        "\nLa coordenada Y es " + circulo.obtenerY() +
        "\nEl radio es " + circulo.obtenerRadio();
        circulo.establecerX( 35 );
        circulo.establecerY( 20 );
        circulo.establecerRadio( 4.25 );
        salida += "\n\nLa nueva ubicación y el radio del círculo son\n" +
        circulo.toString();
        DecimalFormat dosDigitos = new DecimalFormat( "0.00" );
        salida += "\nEl diámetro es " +
        dosDigitos.format( circulo.obtenerDiametro() );
        salida += "\nLa circunferencia es " +
        dosDigitos.format( circulo.obtenerCircunferencia() );
        salida += "\nEl área es " + dosDigitos.format( circulo.obtenerArea() );
        JOptionPane.showMessageDialog( null, salida );
        System.exit( 0 );
    }
    
}

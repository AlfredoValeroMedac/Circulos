/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciruclos;

/**
 *
 * @author alfredo.valero
 */
public class Circulitos {
    private int x;
    private int y;
    private double radio;

    public Circulitos()
    {

    }

    // constructor

    public Circulitos( int valorX, int valorY, double valorRadio )
    {
        x = valorX;
        y = valorY;
        establecerRadio( valorRadio );
    }

    public void establecerX( int valorX )
    {
        x = valorX;
    }

    public int obtenerX()
    {
        return x;
    }

    public void establecerY( int valorY )
    {
        y = valorY;
    }

    public int obtenerY()
    {
        return y;
    }

    public void establecerRadio( double valorRadio )
    {
        radio = ( valorRadio < 0.0 ? 0.0 : valorRadio );
    }

    public double obtenerRadio()
    {
        return radio;
    }

    public double obtenerDiametro()
    {
        return 2 * radio;
    }

    public double obtenerCircunferencia()
    {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea()
    {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString()
    {
        return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    }
}

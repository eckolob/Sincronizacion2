/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion2;

import java.util.Random;

/**
 *
 * @author Marcos
 */
public class Productor implements Runnable
{
    private final Random aleatorio;
    private final Buffer buffer;
    private final Interfaz v;
   

    private final int TIEMPOESPERA = 1500;
 
    /**
     * Constructor de la clase
     * @param buffer Buffer común a los consumidores y el productor
     * @param idproductor Identificador del productor
     */
    public Productor(Buffer buffer,Interfaz ve) 
    {
        this.buffer = buffer;
        aleatorio = new Random();
        this.v= ve;
    }
 
    @Override
    /**
     * Implementación de la hebra
     */
    public void run() 
    {
        while(true)
        {
            int elemento = aleatorio.nextInt(99)+1;
            buffer.Producir(elemento);
            System.out.println();
            v.areabuffer.append("El productor " + " pone: " + elemento+"\n");
            try
            {
                Thread.sleep(TIEMPOESPERA);
            } 
            catch (InterruptedException e) 
            {
                v.areabuffer.append("Productor "  + ": Error en run -> " + e.getMessage());
           
            }
        }
    }
}
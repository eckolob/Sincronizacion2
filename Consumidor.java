/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacion2;

/**
 *
 * @author Marcos
 */
public class Consumidor implements Runnable
{
    private final Buffer buffer;
    private final Interfaz v;

 
    /**
     * Constructor de la clase
     * @param buffer Buffer común a los consumidores y el productor
     * @param idconsumidor Identificador del consumidor
     */
    public Consumidor(Buffer buffer, Interfaz ve) 
    {
        this.buffer = buffer;
        this.v = ve;
    }
 
    @Override
    /**
     * Implementación de la hebra
     */
    public void run() 
    {
        
        while(Boolean.TRUE)
        {
          
            v.areabuffer.append("El consumidor " + " consume: " + buffer.get()+"\n");
            
        }
    }
}
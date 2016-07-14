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
public class Buffer
{
    private int contenido;
     boolean bufferlleno = false;
 
    /**
     * Obtiene de forma concurrente o síncrona el elemento que hay en el contenedor
     * @return Contenido el contenedor
     */
    
     public synchronized void Producir(int value) 
    {
        while (bufferlleno) 
        {//Que el productor espere si el buffer esta lleno
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en put -> " + e.getMessage());
            }
        }//Sino esta lleno que produzca algo, se llene y despierte al consumidor
        contenido = value;
        bufferlleno = true;
        notifyAll();
    }
    public synchronized int Consumir()
    {//mientras el buffer esta vacio el consumidor se duerme 
        while (!bufferlleno)
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Contenedor: Error en get -> " + e.getMessage());
            }
        }
        //si hay algo en el buffer el consumidor consume y despierta al productor
        bufferlleno = false;
        notifyAll();
        return contenido;
    }
 
    /**
     * Introduce de forma concurrente o síncrona un elemento en el contenedor
     * @param value Elemento a introducir en el contenedor
     */
   
}
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
public class ProductorConsumidor 
{
    private static Buffer buffer;
    private static Thread productor;
    private static Thread  consumidor;
    private static Interfaz v;

     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        v= new Interfaz();
        buffer = new Buffer();
        productor = new Thread(new Productor(buffer,v));
       
        consumidor = new Thread(new Consumidor(buffer,v));
           
         
         productor.start();
          consumidor.start();
          
        
    }    
}
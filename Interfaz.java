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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Marcos
 */
public class Interfaz extends JFrame implements KeyListener{
    
    JTextArea areabuffer;
    JScrollPane scrollbuffer;
    JLabel et_productor,et_consumidor,et_tecla;
    JTextField txt_productor,txt_consumidor,txt_tecla;
    boolean I_esc=false;   
    
    Interfaz()
    {
        JFrame ventana =new JFrame();
         ventana.setLayout(null);
       areabuffer = new JTextArea();
       areabuffer.setEditable(false);
       scrollbuffer = new JScrollPane(areabuffer);
       scrollbuffer.setBounds(20, 20, 400, 200);
       ventana.add(scrollbuffer);
       
       
       et_productor = new JLabel();
       et_productor.setText("Productor:");
       et_productor.setBounds(20, 220, 100, 20);
       ventana.add(et_productor);
       
       txt_productor = new JTextField();
       txt_productor.setEditable(false);
       txt_productor.setBounds(100,220,100,20);
       ventana.add(txt_productor);
       
       et_consumidor = new JLabel();
       et_consumidor.setText("Consumidor:");
       et_consumidor.setBounds(20, 240, 100, 20);
       ventana.add(et_consumidor);
      
       txt_consumidor = new JTextField();
       txt_consumidor.setEditable(false);
       txt_consumidor.setBounds(100,240,100,20);
       ventana.add(txt_consumidor);
       
       et_tecla = new JLabel();
       et_tecla.setText("Tecla:");
       et_tecla.setBounds(220, 220, 100, 20);
       ventana.add(et_tecla);
      
       txt_tecla = new JTextField();
       txt_tecla.setEditable(true);
       txt_tecla.setBounds(270,220,100,20);
       ventana.add(txt_tecla);
       
        ventana.setLocation(300, 150);
        ventana.setResizable(true);
        ventana.setVisible(true);
        ventana.setSize(450, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
     @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getSource()==txt_tecla)
        {
             if (KeyEvent.VK_C==e.getKeyCode())
             {
                
               System.out.print("hola");
             }
         }
    
        // throw new UnsupportedOperationException("Not supported yet"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {//SI se suelta la tecla
        
       
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
}
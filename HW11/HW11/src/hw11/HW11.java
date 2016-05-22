//Dustin Whyte
//Snake game
package hw11;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

public class HW11 extends JFrame {
    
    public HW11() {
        
        add(new Board());
        //Affects the insets of the JFrame container
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        //Main Method
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new HW11();
                ex.setVisible(true);                
            }
        });
    }
}

package javagui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JavaGUI {
    JPanel p;
    JFrame f;
    JButton b;
    JLabel l;
    JTextField t;
    JTextField t2;
    
    public JavaGUI () {
        
        f = new JFrame("Basic Text");
        p = new JPanel();
        t = new JTextField("123");
        t2 = new JTextField("456");
        
        b = new JButton("New Document", new ImageIcon("images/g.png"));
        b.setRolloverEnabled(true);
        b.setRolloverIcon(new ImageIcon("images/r.png"));
        
        b.addActionListener(new ButtonListener());
        l = new JLabel("Hello World");
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);
        f.setVisible(true);
        p.add(b);
        
        f.getContentPane().add(p);
        p.add(l);
        p.add(t);
        p.add(t2);
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(args[0] + " " + args[1]);
        new JavaGUI();
    }
    
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String textField = t.getText();
            String textField2 = t2.getText();
            int stringConverted = Integer.parseInt(textField) + Integer.parseInt(textField2);
            
            l.setText("Click" + stringConverted);
            
        }
    
    
}
    
}

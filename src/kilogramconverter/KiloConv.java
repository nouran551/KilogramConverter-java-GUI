package kilogramconverter;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
/**
 *
 * @author Nouran
 */
public class KiloConv extends JFrame{
    
    private JPanel MainPanel;
    private JTextField Text1;
    private JButton Convertbnt;
    private JLabel labTitle;
    
    public KiloConv (){
        // Window Properties
        setTitle("KiloMeterConverter");
        //setSize(500,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //Components
        
        Text1 = new JTextField(10);
        Convertbnt = new JButton("Convert");
        Convertbnt.setForeground(Color.red); // Background and foreground
        Convertbnt.setBackground(Color.CYAN);
        Convertbnt.addActionListener(new buttionoperation());
        labTitle = new JLabel("please enter the distance in kilometers");
        labTitle.setForeground(Color.BLUE);
        labTitle.setBackground(Color.WHITE);
        //panel
        MainPanel = new JPanel();
        MainPanel.setBackground(Color.red);
// Layouts
        //MainPanel.setLayout(new FlowLayout());
        //MainPanel.setLayout(new BorderLayout());
        //MainPanel.setLayout(new GridLayout(3,1));
        MainPanel.setBorder(BorderFactory.createEmptyBorder(60,70,60,70)); //EmptyBorder
        //MainPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 20));
         //MainPanel.setBorder(BorderFactory.createTitledBorder("KilometerProgram"));
        MainPanel.add(labTitle);
        MainPanel.add(Text1);
        MainPanel.add(Convertbnt);
        
        add(MainPanel);
        pack();  // Automatic Resize the window
        setVisible(true);
        
    }
    public class buttionoperation implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
               double val = Double.parseDouble(Text1.getText());
               JOptionPane.showMessageDialog(null,"The value to meter is = " + val * 1000);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}

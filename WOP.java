import javax.swing.*;  
import java.awt.event.*;  
public class WOP extends JFrame implements ActionListener {  
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;  
    JButton b;  
    WOP() {  
        l=new JLabel("Weather Data");  
        l.setBounds(50,40,300,20);  
        cb1=new JCheckBox("Jaipur (India)");  
        cb1.setBounds(100,80,300,20);  
        cb2=new JCheckBox("Mumbai (India)");  
        cb2.setBounds(100,100,300,20);  
        cb3=new JCheckBox("Moscow (Russia)");  
        cb3.setBounds(100,120,300,20); 
        cb4=new JCheckBox("Tokyo (Japan)");  
        cb4.setBounds(100,100,300,20);  
        cb5=new JCheckBox("Newyork City (USA)");  
        cb5.setBounds(100,60,300,20);  
        cb6=new JCheckBox("Sydney (Austrilia)");  
        cb6.setBounds(100,140,300,20);  
        b=new JButton("Check");  
        b.setBounds(100,300,200,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(b);  
        setSize(800,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e) {  
        String msg="";  
        if (cb1.isSelected()) {    
            msg="Jaipur         10:53:00      33°C\n";  
        }  
        if (cb2.isSelected()) {    
            msg+="Mumbai        10:53:00      29°C\n";  
        }  
        if (cb3.isSelected()) {    
            msg+="Moscow        07:29:00      13°C\n";  
        }
        if (cb4.isSelected()) {    
            msg="Tokyo          13:37:00      22°C\n";  
        }  
        if (cb5.isSelected()) {    
            msg+="Newyork City  00:22:00      16°C\n";  
        }  
        if (cb6.isSelected()) {    
            msg+="Sydney        04:03:00      20°C\n";  
        }
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg);  
    }  
    public static void main(String[] args) {  
        new WOP();  
    }  
}
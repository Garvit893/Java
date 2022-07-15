import javax.swing.*;  
import java.awt.event.*;  
public class Mos extends JFrame implements ActionListener {  
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9; 
    JButton b;  
    Mos() {  
        l=new JLabel("Food Ordering System");  
        l.setBounds(50,10,300,20);  
        cb1=new JCheckBox("Chole Bhature (Indian) @ 100/-");  
        cb1.setBounds(60,40,300,20);  
        cb2=new JCheckBox("Pav Bhaji (Indian) @ 80/-");  
        cb2.setBounds(60,60,300,20);  
        cb3=new JCheckBox("North Indian Thali (Indian) @ 300/-");  
        cb3.setBounds(60,80,300,20); 
        cb4=new JCheckBox("South Indian Thali (Indian) @ 290/-");  
        cb4.setBounds(60,100,300,20);  
        cb5=new JCheckBox("Pasta (Italian) @ 80/-");  
        cb5.setBounds(60,120,300,20);  
        cb6=new JCheckBox("Pizza (Italian) @ 250/-");  
        cb6.setBounds(60,140,300,20);  
        cb7=new JCheckBox("Lasagne (Italian) @ 90/-");  
        cb7.setBounds(60,160,300,20);  
        cb8=new JCheckBox("Risotto (Italian) @ 70/-");  
        cb8.setBounds(60,180,300,20);  
        cb9=new JCheckBox("Burger (American) @ 60/-");  
        cb9.setBounds(60,200,300,20);    
        b=new JButton("Order");  
        b.setBounds(100,300,200,30);  
        b.addActionListener(this);  
        add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(cb7);add(cb8);add(cb9);add(b);  
        setSize(800,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e) { 
        float amount=0;  
        String msg="";  
        if (cb1.isSelected()) {  
            amount+=100;  
            msg="Chole Bhature (Indian): 100/-\n";  
        }  
        if (cb2.isSelected()) {  
            amount+=80;  
            msg+="Pav Bhaji (Indian): 80/-\n";  
        }  
        if (cb3.isSelected()) {  
            amount+=300;  
            msg+="North Indian Thali (Indian): 300/-\n";  
        }
        if (cb4.isSelected()) {  
            amount+=290;  
            msg="South Indian Thali (Indian): 290/-\n";  
        }  
        if (cb5.isSelected()) {  
            amount+=80;  
            msg+="Pasta (Italian): 80/-\n";  
        }  
        if (cb6.isSelected()) {  
            amount+=250;  
            msg+="Pizza (Italian): 250/-\n";  
        }
        if (cb7.isSelected()) {  
            amount+=90;  
            msg="Lasagne (Italian): 90/-\n";  
        }  
        if (cb8.isSelected()) {  
            amount+=70;  
            msg+="Risotto (Italian): 70/-\n";  
        }  
        if (cb9.isSelected()) {  
            amount+=60;  
            msg+="Burger (American): 60/-\n";  
        } 
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total(+GST): "+(amount+((18*amount)/100)));  
    }  
    public static void main(String[] args) {  
        new Mos();  
    }  
}
import javax.swing.*;  
import java.awt.event.*;  
public class Tos extends JFrame implements ActionListener { 
    JLabel l; 
    JMenu menu, submenu1, submenu2;  
    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,
    cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,
    cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30;  
    JButton b; 
    Tos() {  
        l=new JLabel("Food Ordering System");  
        l.setBounds(50,50,300,20);
        JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu1=new JMenu("Payment Option");
          submenu2=new JMenu("Delievery Option");  
          i1=new JMenuItem("Home");  
          i2=new JMenuItem("Your Order");  
          i3=new JMenuItem("History");  
          i4=new JMenuItem("UPI");  
          i5=new JMenuItem("Net Banking");
          i6=new JMenuItem("Cash on Delievery");
          i7=new JMenuItem("Dne-in");  
          i8=new JMenuItem("Take Away");
          i9=new JMenuItem("Home Delievery");  
        cb1=new JCheckBox("1, Chole Bhature, 100/-, Indian");  
        cb1.setBounds(60,40,300,20);  
        cb2=new JCheckBox("2, Pav Bhaji, 100/-, Indian");  
        cb2.setBounds(60,60,300,20);  
        cb3=new JCheckBox("3, North Indian Thali, 100/-, Indian");  
        cb3.setBounds(60,80,300,20); 
        cb4=new JCheckBox("4, South Indian Thali, 100/-, Indian");  
        cb4.setBounds(60,100,300,20);  
        cb5=new JCheckBox("5, Risotto, 100/-, Italian");  
        cb5.setBounds(60,120,300,20);  
        cb6=new JCheckBox("6,Pasta, 100/-, Italian");  
        cb6.setBounds(60,140,300,20);  
        cb7=new JCheckBox("7, Pizza,120/-, Italian");  
        cb7.setBounds(60,160,300,20);
        cb8=new JCheckBox("8, Lasagne, 300/-, Italian");  
        cb8.setBounds(60,180,300,20);  
        cb9=new JCheckBox("9, Burger, 290/-, American");  
        cb9.setBounds(60,200,300,20);    
        cb10=new JCheckBox("10, Hot Dogs, 80/-,  American");  
        cb10.setBounds(60,220,300,20);    
        cb11=new JCheckBox("11, Pancakes, 120/-, American");  
        cb11.setBounds(60,240,300,20);    
        cb12=new JCheckBox("12, Bagel, 300/-, American");  
        cb12.setBounds(60,260,300,20);    
        cb13=new JCheckBox("13, Momos, 290/-, Chinese");  
        cb13.setBounds(60,280,300,20);    
        cb14=new JCheckBox("14, Mamchurian, 80/-, Chinese");  
        cb14.setBounds(60,300,300,20);    
        cb15=new JCheckBox("15, Chowmien, 120/-, Chinese");  
        cb15.setBounds(60,320,300,20);    
        cb16=new JCheckBox("16, Spring Rolls, 300/-, Chinese");  
        cb16.setBounds(60,340,300,20);    
        cb17=new JCheckBox("17, Noodles, 290/-, Chinese");  
        cb17.setBounds(60,360,300,20);    
        cb18=new JCheckBox("18, Sushi, 80/-, Chinese");  
        cb18.setBounds(60,380,300,20);    
        cb19=new JCheckBox("19, Miso soup, 120/-, Chinese");  
        cb19.setBounds(60,400,300,20);    
        cb20=new JCheckBox("20, Ramen, 300/-, Chinese");  
        cb20.setBounds(60,420,300,20);    
        cb21=new JCheckBox("21, Gulaab-Jaamun, 290/-, Dessert");  
        cb21.setBounds(60,440,300,20);    
        cb22=new JCheckBox("22, Mochi, 290/-, Dessert");  
        cb22.setBounds(60,460,300,20);    
        cb23=new JCheckBox("23, Cheesecake, 80/-, Dessert");  
        cb23.setBounds(60,480,300,20);    
        cb24=new JCheckBox("24, Gelato Ice-cream, 120/-, Dessert");  
        cb24.setBounds(60,500,300,20);
        cb25=new JCheckBox("25, Red Bean Bun, 290/-, Dessert");  
        cb25.setBounds(60,520,300,20);        
        cb26=new JCheckBox("26, Hot Tea, 290/-, Beverages");  
        cb26.setBounds(60,540,300,20);
        cb27=new JCheckBox("27, Hot Coffee, 80/-, Beverages");  
        cb27.setBounds(60,560,300,20);
        cb28=new JCheckBox("28, Oreo Shake, 120/-, Beverages");  
        cb28.setBounds(60,580,300,20);
        cb29=new JCheckBox("29, Cold Coffee, 300/-, Beverages");  
        cb29.setBounds(60,600,300,20);
        cb30=new JCheckBox("30, Mojito, 290/-, Beverages");  
        cb30.setBounds(60,620,300,20);
        b=new JButton("Order");  
        b.setBounds(450,650,200,30);  
        b.addActionListener(this); 
        menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu1.add(i4); submenu1.add(i5); submenu1.add(i6);
          submenu2.add(i7); submenu2.add(i8); submenu2.add(i9);  
          menu.add(submenu1); menu.add(submenu2);  
          mb.add(menu);  
        add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(cb6);add(cb7);
        add(cb8);add(cb9);add(cb10);add(cb11);add(cb12);add(cb13);add(cb14);add(cb15);
        add(cb16);add(cb17);add(cb18);add(cb19);add(cb20);add(cb21);add(cb22);add(cb23);
        add(cb24);add(cb25);add(cb26);add(cb27);add(cb28);add(cb29);add(cb30);add(b);  
        setSize(800,450);  
        setLayout(null);  
        setVisible(true); 
        setJMenuBar(mb);  
        l.setLayout(null);   
        l.setVisible(true); 
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
        if (cb10.isSelected()) {  
            amount+=90;  
            msg="Hot Dogs (American): 90/-\n";  
        }  
        if (cb11.isSelected()) {  
            amount+=100;  
            msg+="Pancakes (American): 100/-\n";  
        }  
        if (cb12.isSelected()) {  
            amount+=50;  
            msg+="Bagel (American): 50/-\n";  
        } 
        if (cb13.isSelected()) {  
            amount+=65;  
            msg+="Momos (Chinese): 65/-\n";  
        }
        if (cb14.isSelected()) {  
            amount+=80;  
            msg="Mamchurian (Chinese): 80/-\n";  
        }  
        if (cb15.isSelected()) {  
            amount+=75;  
            msg+="Chowmien (Chinese): 75/-\n";  
        }  
        if (cb16.isSelected()) {  
            amount+=60;  
            msg+="Spring Rolls (Chinese): 60/-\n";  
        }
        if (cb17.isSelected()) {  
            amount+=55;  
            msg+="Noodles (Japanese): 55/-\n";  
        } 
        if (cb18.isSelected()) {  
            amount+=150;  
            msg+="Sushi (Japanese): 150/-\n";  
        }
        if (cb19.isSelected()) {  
            amount+=90;  
            msg="Miso soup (Japanese): 90/-\n";  
        }  
        if (cb20.isSelected()) {  
            amount+=65;  
            msg+="Ramen (Japanese): 65/-\n";  
        }  
        if (cb21.isSelected()) {  
            amount+=80;  
            msg+="Gulaab Jaamun (Dessert): 80/-\n";  
        } 
        if (cb22.isSelected()) {  
            amount+=49;  
            msg="Mochi (Dessert): 49/-\n";  
        }  
        if (cb23.isSelected()) {  
            amount+=69;  
            msg+="Red Bean Bun (Dessert): 69/-\n";  
        }  
        if (cb24.isSelected()) {  
            amount+=99;  
            msg+="Cheesecake (Dessert): 99/-\n";  
        }
        if (cb25.isSelected()) {  
            amount+=89;  
            msg="Gelato Ice Cream (Dessert): 89/-\n";      
        }  
        if (cb26.isSelected()) {  
            amount+=29;  
            msg+="Tea (Beverage): 29/-\n";      
        }  
        if (cb27.isSelected()) {  
            amount+=49;  
            msg+="Hot Coffee (Beverage): 49/-\n";    
        } 
        if (cb28.isSelected()) {  
            amount+=119;  
            msg="Oreo Shake (Beverage): 119/-\n";              
        }  
        if (cb29.isSelected()) {  
            amount+=89;  
            msg+="Cold Coffee (Beverage): 89/-\n";      
        }  
        if (cb30.isSelected()) {  
            amount+=59;  
            msg+="Mojito (Beverage): 59/-\n";  
        } 
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total( +GST included): "+(amount+((18*amount)/100)));  
    }  
    public static void main(String[] args) {  
        new Tos();  
    }  
}
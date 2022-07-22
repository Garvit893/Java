import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Demo extends JFrame {
	JRadioButton jRadioButton1;
	JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
	JButton jButton;
	ButtonGroup G1;
	JLabel L1;
	public Demo() {
		this.setLayout(null);
		jRadioButton1 = new JRadioButton();
		jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
		jButton = new JButton("Click");
		G1 = new ButtonGroup();
		L1 = new JLabel("Qualification");
		jRadioButton1.setText("UGraduate");
		jRadioButton2.setText("PGraduate");
        jRadioButton3.setText("CGraduate");
		jRadioButton1.setBounds(120, 30, 150, 50);
		jRadioButton2.setBounds(250, 30, 150, 50);
        jRadioButton3.setBounds(400, 30, 150, 50);
		jButton.setBounds(125, 90, 80, 30);
		L1.setBounds(20, 30, 150, 50);
		this.add(jRadioButton1);
		this.add(jRadioButton2);
        this.add(jRadioButton3);
		this.add(jButton);
		this.add(L1);
		G1.add(jRadioButton1);
		G1.add(jRadioButton2);
        G1.add(jRadioButton3);
	}
}
class RadioButton {
	public static void main(String args[]) { 
		Demo f = new Demo();
		f.setBounds(100, 100, 550, 200);
		f.setTitle("RadioButtons");
		f.setVisible(true);
	}
}
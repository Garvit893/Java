import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
public class demo extends JFrame implements ItemListener, ActionListener {
    static JFrame f;
	static JLabel l, l1;
	static JComboBox c1;
	static JTextField tf;
	public static void main(String[] args) {
		f = new JFrame("frame");
		demo s = new demo();
		f.setLayout(new FlowLayout());
		String s1[] = { };
		c1 = new JComboBox(s1);
		tf = new JTextField(16);
		JButton b = new JButton("ADD");
		JButton b1 = new JButton("REMOVE");
		b.addActionListener(s);
		b1.addActionListener(s);
		c1.addItemListener(s);
		l = new JLabel("Your Order ");
		l1 = new JLabel("Add Dish");
		l.setForeground(Color.red);
		l1.setForeground(Color.blue);
		JPanel p = new JPanel();
		p.add(l);
		p.add(c1);
		p.add(l1);
		p.add(tf);
		p.add(b);
		p.add(b1);
		f.setLayout(new FlowLayout());
		f.add(p);
		f.setSize(700, 200);
		f.show();
	}
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("ADD")) {
			c1.addItem(tf.getText());
		}
		else {
			c1.removeItem(tf.getText());
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == c1) {
			l1.setText(c1.getSelectedItem() + " selected");
		}
	}
}

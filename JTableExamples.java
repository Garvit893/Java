import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class RestMenu {
	JFrame f;
	JTable j;
	RestMenu() {
		f = new JFrame();
		f.setTitle("Resturant Menu");
		String[][] data = {
			{ "1", "Chole Bhature", "Indian", "80/-" },
			{ "2", "Pav Bhaji", "Indian", "60/-" },
            { "3", "North Indian Thali", "Indian", "200/-" },
            { "4", "South Indian Thali", "Indian", "200/-" },
            { "5", "Pasta", "Italian", "80/-" },
            { "6", "Pizza", "Italian", "180/-" },
            { "7", "Lasagne", "Italian", "180/-" },
            { "8", "Risotto", "Italian", "180/-" },
            { "9", "Burger", "American", "60/-" },
            { "10", "Hot Dogs", "American", "70/-" },
            { "11", "Pancakes", "American", "90/-" },
            { "12", "Bagel", "American", "50/-" },
            { "13", "Momos", "Chinese", "60/-" },
            { "14", "Mamchurian", "Chinese", "70/-" },
            { "15", "Chowmien", "Chinese", "60/-" },
            { "16", "Spring Rolls", "Chinese", "50/-" },
            { "17", "Noodles", "Japanese", "40/-" },
            { "18", "Sushi", "Japanese", "120/-" },
            { "19", "Miso soup", "Japanese", "100/-" },
            { "20", "Ramen", "Japanese", "55/-" },
            { "21", "Gulaab-Jaamun", "Desset", "90/-" },
            { "22", "Mochi", "Desset", "85/-" },
            { "23", "Red Bean Bun", "Desset", "80/-" },
            { "24", "Cheesecake", "Desset", "60/-" },
            { "25", "Gelato Ice-cream", "Desset", "120/-" },
		};
		String[] columnNames = { "S.No.", "Dish Name", "Cuisine Type", "Price" };
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		f.setSize(500, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new RestMenu();
	}
}

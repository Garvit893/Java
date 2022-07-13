import java.io.File;
import java.util.Scanner;
public class Read {
public static void main(String[] args) throws Exception {
	File file = new File("/home/mm23/Desktop/Temp.txt");
	Scanner sc= new Scanner(System.in);

	while (sc.hasNextLine())
	System.out.println(sc.nextLine());
}
}

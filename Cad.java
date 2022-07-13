import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;
import java.util.*;
public class Cad {
    public static void main( String args[] ) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 for the details of Jaipur");
        System.out.println();
        System.out.println("Enter 4 for the details of Mumbai");
        System.out.println();
        System.out.println("Enter 6 for the details of Moscow");
        System.out.println();
        System.out.println("Enter 8 for the details of Tokyo");
        System.out.println();
        System.out.println("Enter 10 for the details of Newyork");
        System.out.println();
        System.out.println("Enter 12 for the details of Sydney");
        System.out.println();
        System.out.println("Enter Your Choice of City: ");
        int a = sc.nextInt();
        System.out.println();
      int n = 0;
      String line1;
      try (Stream<String> lines = Files.lines(Paths.get("Temp.txt"))) {
        line1 = lines.skip(n).findFirst().get();
        System.out.println(line1);
      }
      catch(IOException e) {
        System.out.println(e);
      }      
      String line2;
      try (Stream<String> lines = Files.lines(Paths.get("Temp.txt"))) {
        line2 = lines.skip(a).findFirst().get();
        System.out.println(line2);
      }
      catch(IOException e){
        System.out.println(e);
      }
    }
}
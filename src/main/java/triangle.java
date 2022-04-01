import java.util.Scanner;

public class triangle {
    
public static String printTriangle (int s) {
        
        if (s == 1) {
              System.out.print( "*");
             return "*";
        } 
        
        else {
              System.out.print( "*".repeat(s) + "\n");
              return printTriangle (s-1);
        }
}
	public static void main(String[] args) {
	    
		Scanner nic = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int s = nic.nextInt();
		printTriangle(s);
		nic.close();
	}
}
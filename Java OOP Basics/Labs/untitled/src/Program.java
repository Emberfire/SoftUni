import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(console.readLine());

        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < n + 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            } 
            else
            {
                for (int j = 0; j < n-i; j++)
                {
                    System.out.print(" ");                    
                }
                for (int j = 0; j < i; j++)
                {
                    System.out.print("*");
                    
                }
                System.out.print(" | ");
                for (int j = 0; j < i ; j++)
                {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
            
        }
    }
}

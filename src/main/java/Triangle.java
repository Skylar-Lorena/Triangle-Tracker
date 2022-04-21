import java.io.Console;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Input side A:");
    String sideA = myObj.nextLine();
    int  a = Integer.parseInt(sideA);
    System.out.println("Input side B:");
    String sideB = myObj.nextLine();
    int  b = Integer.parseInt(sideB);
    System.out.println("Input side C:");
    String sideC = myObj.nextLine();
    int  c = Integer.parseInt(sideC);

    System.out.println("Do the sides A, B, C form a Triangle? " + isValidTriangle(a , b , c ) );
    }
    public static boolean isValidTriangle(int a, int b, int c) {
        return(a + b > c && b + c > a && c + a > b);
    }
}

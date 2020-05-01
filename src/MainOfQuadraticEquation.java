import java.util.Scanner;

public class MainOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a=scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b=scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        quadraticEquation.resultRoot();
    }
}

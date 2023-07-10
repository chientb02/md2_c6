package baiTap.thietKeVaTrienKhaiTriangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle() ;
        System.out.println("nhap canh a");
        triangle.setSide1(scanner.nextDouble());
        System.out.println("nhap canh b");
        triangle.setSide2(scanner.nextDouble());
        System.out.println("nhap canh c");
        triangle.setSide3(scanner.nextDouble());
        System.out.println(triangle.toString());
    }
}

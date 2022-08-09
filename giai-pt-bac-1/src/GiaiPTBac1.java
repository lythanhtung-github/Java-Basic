import java.util.Scanner;

public class GiaiPTBac1 {

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1 ax + b = c");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                if (b == c) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        } else{
            System.out.println("Phương trình có nghiệm là x = %f!\n" + (c-b)/a);
        }

    }
}

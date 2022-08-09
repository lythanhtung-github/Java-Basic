import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double rate = 23000.0;
        double usd, vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muôn chuyển đổi:");
        usd = sc.nextDouble();

        vnd = usd * rate;
        System.out.println(usd + " USD tương ứng với "+ vnd + " VND");
    }
}
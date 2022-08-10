import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.println("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        //CÁCH 1
        int bcnn = num1 > num2 ? num1 : num2;
        while (true) {
            if (bcnn % num1 == 0 && bcnn % num1 == 0) {
                System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + bcnn);
                break;
            }
            bcnn++;
        }

        //CÁCH 2:
//        if (num1 == 0 || num2 == 0){
//            System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + 0);
//        } else {
//            int ucln = num1 < num2 ? num1 : num2;
//            while (true) {
//                if (num1 % ucln == 0 && num2 % ucln == 0) {
//                    System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + num1 * num2 / ucln);
//                    break;
//                }
//                ucln--;
//            }
//        }


        //TÌM BỘI CHUNG NHỎ NHẤT 3 SỐ:
//        System.out.println("Nhập số thứ ba: ");
//        int num3 = scanner.nextInt();
//
//        int bcnn3 = num1>num2?num1>num3?num1:num3:num2;
//        while (true) {
//            if (bcnn3 % num1 == 0 && bcnn3 % num2 == 0 && bcnn3 % num3 == 0)  {
//                System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " và " + num3 + " là: " + bcnn3);
//                break;
//            }
//            bcnn3++;
//        }

    }
}
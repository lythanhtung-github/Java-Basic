import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng bạn muốn tính ngày: ");
        byte month = sc.nextByte();
            switch (month)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 28 ngày hoặc 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                default:
                    System.out.println("Tháng không hợp lệ");
                    break;
            }
    }
}

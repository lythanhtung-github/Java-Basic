import org.w3c.dom.ls.LSInput;

import java.io.SequenceInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("Nhập chiều cao của bạn: ");
        height = sc.nextDouble();
        System.out.println("Nhập cân nặng của bạn: ");
        weight = sc.nextDouble();

        bmi = weight/(height*height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        } else {
            if (bmi < 25.0) {
                System.out.printf("%-20.2f%s",bmi,"Normal");
            } else {
                if (bmi < 30.0) {
                    System.out.printf("%-20.2f%s",bmi,"Overweight");
                } else {
                    System.out.printf("%-20.2f%s",bmi,"Obese");
                }
            }
        }
    }
}
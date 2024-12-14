//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Caci1 c1 = new Caci1();
        Scanner sc = new Scanner(System.in);
        int num1;
        double num2;
        byte num3;
//        System.out.println("1.Addition");
//        System.out.println("2.Subtraction");
//        System.out.println("3.Multiplication");
//        System.out.println("4.Division");
//        System.out.println("5.Exponent");
//        System.out.println("6.Exit");
//

                int n;
                System.out.println("enter the operation you want or enter 'exit' to end calci");
                n = sc.nextInt();
                if (n == 2) {
                    System.out.println("enter two numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextDouble();
                    Caci1.add(num1, num2);
                    Caci1.sub(num1, num2);
                    Caci1.mul(num1, num2);
                    Caci1.div(num1, num2);
                    Caci1.exp(num1, num2);
                } else if (n == 3) {
                    System.out.println("enter two numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextDouble();
                    num3 = sc.nextByte();
                    Caci1.add(num1, num2, num3);
                    Caci1.sub(num1, num2, num3);
                    Caci1.mul(num1, num2, num3);
                    Caci1.div(num1, num2, num3);

                } else {
                    System.out.println("Invalid Choice");
                }
            }
        }








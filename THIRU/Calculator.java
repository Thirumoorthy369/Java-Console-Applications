
import java.util.*;
public class Calculator {
    Scanner sc = new Scanner(System.in);
    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();
    void opreation(){
       thiru: while(true) {
        int d = 6;
        System.out.println("enter the case you want:");
        d = sc.nextInt();
            switch (d) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.println(n1 / n2);
                    break;
                case 5:
                    System.out.println(Math.pow(n1, n2));
                    break;
                case 6:
                    break thiru;
            }
        }
    }
}

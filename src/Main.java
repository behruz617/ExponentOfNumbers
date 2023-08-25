import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = sc.nextInt();

        System.out.print("Enter the power ");
        int power = sc.nextInt();

        //         USING WHILE
//        int result = 1;
//        int i=1;
//
//        while (i<=power){
//            result*=number;
//            i++;
//        }
//        System.out.println("Result "+result);


        // USING FOR:
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result " + result);

        // OR:
//        int i = 1;
//        double result = Math.pow(number, power);
//        System.out.println((int) result);

    }
}

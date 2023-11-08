import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //        ======================== Q1 ========================
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int number = input.nextInt();
//        if (number >= 0 ){
//            System.out.println("POSITIVE");
//        } else {
//            System.out.println("NEGATIVE");
//        }

        //        ======================== Q2 ========================

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Number : ");
//        int A = input.nextInt();
//        System.out.print("Enter Number : ");
//        int B = input.nextInt();
//        int tmp ;
//        tmp = A;
//        A = B;
//        B = tmp;
//        System.out.println("number A = "+A);
//        System.out.println("number B = "+B);


        //        ======================== Q3 ========================

//        Scanner input = new Scanner(System.in);
//        System.out.print("First : ");
//        int A = input.nextInt();
//        System.out.print("Secend : ");
//        int B = input.nextInt();
//        int sum = 0;
//
//        for (int i = A ;i<=B ;i++){
//            sum +=i;
//        }
//        System.out.println("SUM = "+sum);

        //        ======================== Q4 ========================


//        Scanner input = new Scanner(System.in);
//        System.out.print("First : ");
//        int A = input.nextInt();
//        System.out.print("Secend : ");
//        int B = input.nextInt();
//        int sumEven=0 , sumOdd=0;
//
//        for (int i = A ;i<=B ;i++){
//            if(i%2==0){
//                sumEven+=i;
//            }else {
//                sumOdd+=i;
//            }
//        }
//        System.out.println("SUMEven = "+sumEven+"\n SUM Odd = "+sumOdd);


        //        ======================== Q5 ========================

        Scanner input = new Scanner(System.in);

        int[] num = {10,20};

        for (int i = 0; i<2 ; i++){
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));




    }
}